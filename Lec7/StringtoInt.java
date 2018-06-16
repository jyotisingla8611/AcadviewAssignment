/*Take two numbers as string input and convert them into Integers and find the 
maximum of the two numbers.*/
package Assignment7;
import java.util.Scanner;
public class StringtoInt {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	String str1=" ",str2=" ";
	System.out.println("Enter 2 strings");
	str1=obj.nextLine();
	str2=obj.nextLine();
	int num1=Integer.parseInt(str1);
	int num2=Integer.parseInt(str2);
	System.out.println("After converting a string into a integer we get:");
	System.out.println("Str1:"+num1);
	System.out.println("Str2:"+num2);
	if(num1>num2)
		System.out.println(num1+" is maximum of two integers");
	else
		System.out.println(num2+" is maximum of two integers");
	}

}
