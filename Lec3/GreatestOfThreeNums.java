package Assignment3;
import java.util.Scanner;

public class GreatestOfThreeNums {
	   @SuppressWarnings("resource")
	public static void main(String ar[])
	   {
		   Scanner obj=new Scanner(System.in);
			int n1,n2,n3,n4;
			System.out.println("Enter 3 numbers");
			n1=obj.nextInt();
			n2=obj.nextInt();
			n3=obj.nextInt();
			n4=greatest(n1,n2,n3);
			System.out.println("Greatest is as = "+n4);   
	   }
	   public static int greatest(int a,int b,int c)
	   {
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	   }
}
