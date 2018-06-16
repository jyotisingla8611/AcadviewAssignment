package Assignment3;
import java.util.Scanner;
public class LeapYear {
	public static void main(String ar[])
	   {
			@SuppressWarnings("resource")
			Scanner obj=new Scanner(System.in);
			int year;
			System.out.println("Enter a year");
			year=obj.nextInt();
			check(year);
	   }
	   public static void check(int x)
	   {
		   if(x%400==0)
			   System.out.println("YEAR IS A LEAP YEAR");
		   else if(x%100==0)
			   System.out.println("YEAR IS NOT A LEAP YEAR");
		   else if(x%4==0)
			   System.out.println("YEAR IS A LEAP YEAR");
		   else
			   System.out.println("YEAR IS NOT A LEAP YEAR");
	   }
}
