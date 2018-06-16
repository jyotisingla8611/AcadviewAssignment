package Assignment8;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String word;
		System.out.println("Enter a string");
		word=obj.nextLine();
		char arr[]=word.toCharArray();
		int length;
		length=word.length();
		System.out.println("Length of a string is :"+length+"\nReverse of a string is");
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}
