package Assignment4;
import java.util.Scanner;
public class Armstrong {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=obj.nextInt();
		int count=0,rem,num1,num2;
		int rem1,sum=0;
		num1=num2=num;
		while(num!=0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Number of digits in entered number is as : "+count);
		while(num1!=0)
		{
			rem1=num1%10;
			sum=(int) (sum+Math.pow(rem1,count));
			num1=num1/10;
		}
		if(num2==sum)
			System.out.println("Number is an Armstrong Number");
		else
			System.out.println("Number is not an Armstrong Number");
	}
}