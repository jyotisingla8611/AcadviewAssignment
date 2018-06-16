package Assignment4;
import java.util.Scanner;
public class BinarySearch {
	@SuppressWarnings({ "resource" })
	public static void main(String...args)
	{
		int arr[]= {1,4,6,7,8,9,10};
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter the number to be found");
		num=obj.nextInt();
		int mid,beg,end,flag=0;
		beg=arr[0];
		end=arr.length-1;
		mid=(beg+end)/2;
		while(beg<=end)
		{
			if(arr[mid]>num)
				end=mid-1;
			else if(arr[mid]==num)
			{
				flag=1;
				break;
			}
			else
				beg=mid+1;
			mid=(beg+end)/2;
		}
		if(flag==1)
			System.out.println("Element is found at index "+mid);
		else
			System.out.println("Element is not found");
	}

}
