package Recursion;

import java.util.Scanner;

public class Fibbonici {
	public static int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return(fib(n-1)+ fib(n-2));
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int num;
		System.out.println("Enter a num upto which fibbonici series is required ");
		num=o.nextInt();
		for(int i=0;i<num;i++)
		System.out.print(fib(i)+"  ");
	}

}
