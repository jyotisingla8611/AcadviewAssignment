/*Print length of longest increasing sub array. */
package Assignment6;

import java.util.Scanner;

public class SubArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size=obj.nextInt();
		int[] arr;
		arr=new int[size];
		int max=0,count=0;
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
				if(arr[i+1]>arr[i])
				{
					count++;
				}
				else
				{
					if(count>max)
						max=count;
					count=1;
				}
		}
		System.out.println("Largest subarray is of lenght :"+max);
	}
}