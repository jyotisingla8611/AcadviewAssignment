package Recursion;

import java.util.Scanner;

public class PrintCodes {
	@SuppressWarnings("unused")
	private static void codes(int num) {
		int length = (int) (Math.log10(num) + 1);
		if(num==0)
			return;
		codes(num/10);
		char xyz;
		num=num%10;
		xyz=(char) (num+96);
		System.out.print(xyz+"");
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int num;
		System.out.println("Enter a num ");
		num=o.nextInt();
		codes(num);
	}
}
