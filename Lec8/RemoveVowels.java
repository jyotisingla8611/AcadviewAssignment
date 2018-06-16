/*Write a Java program to remove all vowels from the String. */
package Assignment8;

import java.util.Scanner;

public class RemoveVowels {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			String word;
			System.out.println("Enter a string");
			word=obj.nextLine();
			char arr[]=word.toCharArray();
			int n;
			n=word.length();
			for(int i=0;i<n;i++)
			{
				if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
					System.out.print("");
				else
					System.out.print(arr[i]);
			}

	}

}
