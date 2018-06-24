/* Create a generic Sorting function that can sort any type of array (primitive types).*/
package Lec13;
import java.util.*;
public class GenericSorting {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<Integer>arr1=new ArrayList<Integer>();
		Scanner obj=new Scanner(System.in);
		Scanner obj2=new Scanner(System.in);
		ArrayList<String>arr2=new ArrayList<String>();
		Integer num;
		String str;
		System.out.println("Enter 10 integers");
		for(int i=0;i<10;i++)
		{
			num=obj2.nextInt();
			arr1.add(num);
		}
		System.out.println("Enter 10 Strings");
		for(int i=0;i<10;i++)
		{
			str=obj.nextLine();
			arr2.add(str);
		}
		Collections.sort(arr1);
		Collections.sort(arr2);
		System.out.println("After sorting");

		for(Integer arr3:arr1) {
			System.out.print(arr3+" ");
		}
		System.out.println("");
		for(String arr3:arr2) {
			System.out.print(arr3+" ");
		}		
	}

}
