package Assignment3;
import java.util.Scanner;
public class Add {
   public static void main(String ar[])
   {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter 2 numbers");
		n1=obj.nextInt();
		n2=obj.nextInt();
		n3=sum(n1,n2);
		System.out.println("Sum is as = "+n3);
   }
   public static int sum(int x,int y)
   {
	   int z;
	   z=x+y;
	   return z;
   }
}
