package Recursion;
import java.util.Scanner;
public class Gcd {
	public static int hcf(int n,int n1)
	{
		    int rem;
		    if(n1>n)
		    {
		    	rem=n1%n;
		    	if(rem==0)
		    		return n;
		    	else
		    		return(hcf(n,rem));
		    }
		    else
		    {
		    	rem=n%n1;
		    	if(rem==0)
		    		return n1;
		    	else
		    		return(hcf(n1,rem));
		    }
		    	
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner o=new Scanner(System.in);
		int num,num2;
		System.out.println("Enter two numbers ");
		num=o.nextInt();
		num2=o.nextInt();
		int x=hcf(num,num2);
		System.out.print(x);

	}

}
