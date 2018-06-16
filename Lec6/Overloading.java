/*Overload Print function to accept Null arguments , one integer , one float.
*/
package Assignment6;
import java.util.Scanner;
 class Test {
	void call()
	{
	System.out.println("This function has NULL arguments");
	}
	public void call(int a)
	{
	System.out.println("This function has a INT argument:"+a);
	}
	public void call(float f)
	{
	System.out.println("This function has a FLOAT argument:"+f);
	}	
}
public class Overloading {
	@SuppressWarnings("resource")
	public static void main(String...ar)
	{
		Test obj=new Test();
		Scanner obj1=new Scanner(System.in);
		obj.call();
		int num1;
		float num2;
		System.out.println("Enter an integer and a float value");
		num1=obj1.nextInt();
		num2=obj1.nextFloat();
		obj.call(num1);
		obj.call(num2);
	}
}
