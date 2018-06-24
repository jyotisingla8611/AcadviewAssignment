/*Create a generic print function that can print all types of arrays (primitive types).*/
package Lec13;

import java.util.Scanner;

public class GenericArrays {

	public static <T> void print(T[] arr) {
		System.out.println();
		for(T element:arr) {
			System.out.println(element);
		}	
	}

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Integer[] arr1=new Integer[5];
		Double[] arr2=new Double[5];
		String[] arr3=new String[5];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter integers");
		for(int i=0;i<5;i++)
			arr1[i]=obj.nextInt();
		System.out.println("Enter double");
		for(int i=0;i<5;i++)
		   arr2[i]=obj.nextDouble();
		System.out.println("Enter strings");
		for(int i=0;i<5;i++)
			arr3[i]=obj.nextLine();
		print(arr1);
		print(arr2);
		print(arr3);
	}

}
