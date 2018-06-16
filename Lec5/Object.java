package Assignment5;

import java.util.Scanner;

public class Object {
	 
		int length,breadth;

		public int getLength() {
			return length;
		}
		public void setLength(int l) {
			length = l;
		}
		public int getBreadth() {
			return breadth;
		}
		public void setBreadth(int b) {
			breadth = b;
		}
		public void Calc_area()
		{
			System.out.println("Area of a rectangle : "+(length*breadth));
		}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Object obj = new Object();
		int l,b;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter length and breadth ");
		l=obj1.nextInt();
		b=obj1.nextInt();
		obj.setLength(l);
		obj.setBreadth(b);
		obj.Calc_area();
	}

}
