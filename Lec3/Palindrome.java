package Assignment3;
import java.util.Scanner;
public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		Scanner obj=new Scanner(System.in);
		int num,org,r,sum=0;
		System.out.println("Enter a number");
		num=obj.nextInt();
		org=num;
		while(num<0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==org)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");
	}
}
