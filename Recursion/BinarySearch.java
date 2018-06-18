package Recursion;
import java.util.Scanner;
public class BinarySearch {
	public static int binary(int [] arr,int val, int begin, int end)
	{
		int mid = (begin + end)/2;
		if(val == arr[mid])
			return mid;
		else if(val < arr[mid])
			return binary(arr,val,begin,mid-1);
		else if(val > arr[mid]) {
			return binary(arr,val,mid+1,end);
		}
		return mid;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = obj.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements in sorted manner");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = obj.nextInt();
		}
		System.out.println("Enter value to be searched");
		int val = obj.nextInt();
		obj.close();
		System.out.println("The value "+ val + " is at index " + binary(arr,val,0,size-1));
	}
}