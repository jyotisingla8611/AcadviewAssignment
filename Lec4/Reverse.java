package Assignment4;

import java.util.Scanner;

public class Reverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		int num,rem,sum=0;
		System.out.println("Enter a number");
		num=obj.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("Reverse is as : "+sum);

	}

}
