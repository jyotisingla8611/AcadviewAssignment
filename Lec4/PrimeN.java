package Assignment4;
import java.util.Scanner;
public class PrimeN {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int num,flag;
		System.out.println("Enter a number");
		num=obj.nextInt();
		System.out.println("Prime Numbers are as :");
		for(int j=1;j<=num;j++)
		{
			flag=1;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(j+" ");	
			}
		}
	}
}
