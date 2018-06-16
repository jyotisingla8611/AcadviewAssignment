package Assignment4;
import java.util.Scanner;
public class Even {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=obj.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
