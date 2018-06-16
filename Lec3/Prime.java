package Assignment3;
import java.util.Scanner;
public class Prime {
	public static void main(String ar[])
	{
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		int num,flag=0;
		System.out.println("Enter a number");
		num=obj.nextInt();
		if(num<=1)
			flag=1;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("Number is Prime ");
		else
			System.out.println("Number is not a prime");
	}
}
