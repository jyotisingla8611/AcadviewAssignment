package Recursion;

import java.util.Scanner;

public class SumOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a num ");
		int num=obj.nextInt();
		System.out.println(sum(num));
	}
	public static int sum(int num) {
		if(num!=0)
		return (num%10 + sum(num/10));
		else
		return 0;
		
	}

}
