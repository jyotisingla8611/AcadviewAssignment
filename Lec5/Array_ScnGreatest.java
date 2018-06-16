package Assignment5;
import java.util.Scanner;
public class Array_ScnGreatest {
	@SuppressWarnings("resource")
	public static void main(String ar[])
	{
		int num,temp;
        int[] arr = new int[10];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int i=0;i<10;i++)
		{
			num=obj.nextInt();
			arr[i]=num;
		}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest element of array is : "+arr[8]);
	}
}
