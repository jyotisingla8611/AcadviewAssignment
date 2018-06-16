/*Write a Java program to check occurrence of a string in another string, where both strings are taken as input from the user. */
package Assignment8;

import java.util.Scanner;

public class Occurence {

	@SuppressWarnings({ "unused", "resource", "null" })
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String word,sub;
		System.out.println("Enter a main string");
		word=obj.nextLine();
		System.out.println("Enter a sub string");
		sub=obj.nextLine();
		if(word.contains(sub)==true)
			System.out.println("Substrig is present in a string");
		else
			System.out.println("Substring is not present in a string");
	}

}