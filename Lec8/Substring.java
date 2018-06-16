/* Write a Java program to generate all substrings of the string xyz.*/
package Assignment8;

import java.util.Scanner;

public class Substring {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String word;
		System.out.println("Enter a string");
		word=obj.nextLine();
		char arr[]=word.toCharArray();
		int n;
		n=word.length();
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=0;j<=(n-i);j++)
			{
				l=i+j-1;
				for(k=j;k<=l;k++)
					System.out.print(arr[k]);
				System.out.println("");
			}
		}
		
	}

}
