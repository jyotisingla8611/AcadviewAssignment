/*Write a Java program to count the number of words in a sentence taken as input.*/
package Assignment8;

import java.util.Scanner;

public class CountWords {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String word;
		System.out.println("Enter a string");
		word=obj.nextLine();
		char arr[]=word.toCharArray();
		int n,count=1;
		n=word.length();
			for(int i=1;i<n;i++)
			{
				if(arr[i]==' '&& arr[i+1]!=' ')
					count++;
			}	
		System.out.println("Number of words in above sentence is "+count);

	}

}
