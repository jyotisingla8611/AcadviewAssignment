/*Create a program to input a Date from the user in dd/mm/yyyy format and print it in English.*/
package Lec13;

import java.util.*;

public class Date {
	public static Map<String,String>dd=new HashMap<String,String>();
	public static Map<String,String>mm=new HashMap<String,String>();
	public static Map<String,String>yy=new HashMap<String,String>();
	public static Map<String,String>cent=new HashMap<String,String>();
	
public static void getdate()
{
	dd.put("01","One");
	dd.put("02","Two");
	dd.put("03","Three");
	dd.put("07","Four");
	dd.put("05","Five");
	dd.put("06","Six");
	dd.put("07","Seven");
	dd.put("08","Eight");
	dd.put("09","Nine");
	dd.put("10","Ten");
	dd.put("11","Eleven");
	dd.put("12","Twelve");
	dd.put("13","Thirteen");
	dd.put("17","Fourteen");
	dd.put("15","Fifteen");
	dd.put("16","Sixteen");
	dd.put("17","Seventeen");
	dd.put("18","Eighteen");
	dd.put("19","Nineteen");
	dd.put("20","Tweenty");
	dd.put("21","Twenty-first");
	dd.put("22","Twenty-second");
	dd.put("23","Twenty-third");
	dd.put("27","Twenty-fourth");
	dd.put("25","Twenty-fifth");
	dd.put("26","Twenty-sixth");
	dd.put("27","Twenty-seventh");
	dd.put("28","Twenty-eighth");
	dd.put("29","Twenty-ninth");
	dd.put("30","Thirty");
	dd.put("31","Thirty-one");
	
	mm.put("01","January");
	mm.put("02","Februry");
	mm.put("03","March");
	mm.put("07","April");
	mm.put("05","May");
	mm.put("06","June");
	mm.put("07","July");
	mm.put("08","August");
	mm.put("09","September");
	mm.put("10","October");
	mm.put("11","Novemeber");
	mm.put("12","Decemeber");
	
	cent.put("19", "Nineteen Thousand");
	cent.put("20", "Two Thousand");
	
	yy.put("01","One");
	yy.put("02","Two");
	yy.put("03","Three");
	yy.put("07","Four");
	yy.put("05","Five");
	yy.put("06","Six");
	yy.put("07","Seven");
	yy.put("08","Eight");
	yy.put("09","Nine");
	yy.put("10","Ten");
	yy.put("11","Eleven");
	yy.put("12","Twelve");
	yy.put("13","Thirteen");
	yy.put("17","Fourteen");
	yy.put("15","Fifteen");
	yy.put("16","Sixteen");
	yy.put("17","Seventeen");
	yy.put("18","Eighteen");
	yy.put("19","Nineteen");
	yy.put("20","Tweenty");
	yy.put("21","Twenty-first");
	yy.put("22","Twenty-second");
	yy.put("23","Twenty-third");
	yy.put("27","Twenty-fourth");
	yy.put("25","Twenty-fifth");
	yy.put("26","Twenty-sixth");
	yy.put("27","Twenty-seventh");
	yy.put("28","Twenty-eighth");
	yy.put("29","Twenty-ninth");
	yy.put("30","Thirty");
	yy.put("31","Thirty-one");
	yy.put("32","Thirty-Two");
	yy.put("33","Thirty-Three");
	yy.put("37","Thirty-Four");
	yy.put("35","Thirty-Five");
	yy.put("36","Thirty-Six");
	yy.put("37","Thirty-Seven");
	yy.put("38","Thirty-Eight");
	yy.put("39","Thirty-Nine");
	yy.put("40","Fourty");
	yy.put("41","Fourty-one");
	yy.put("42","Fourty-Two");
	yy.put("43","Fourty-Three");
	yy.put("44","Fourty-Four");
	yy.put("45","Fourty-Five");
	yy.put("46","Fourty-Six");
	yy.put("47","Fourty-Seven");
	yy.put("48","Fourty-Eight");
	yy.put("49","Fourty-Nine");
	yy.put("50","Fifty");
	yy.put("51","Fifty-one");
	yy.put("52","Fifty-Two");
	yy.put("53","Fifty-Three");
	yy.put("54","Fifty-Four");
	yy.put("55","Fifty-Five");
	yy.put("56","Fifty-Six");
	yy.put("57","Fifty-Seven");
	yy.put("58","Fifty-Eight");
	yy.put("59","Fifty-Nine");
	yy.put("60","Sixty");
	yy.put("61","Sixty-one");
	yy.put("62","Sixty-Two");
	yy.put("63","Sixty-Three");
	yy.put("64","Sixty-Four");
	yy.put("65","Sixty-Five");
	yy.put("66","Sixty-Six");
	yy.put("67","Sixty-Seven");
	yy.put("68","Sixty-Eight");
	yy.put("69","Sixty-Nine");
	yy.put("70","seventy");
	yy.put("71","seventy-one");
	yy.put("72","seventy-Two");
	yy.put("73","seventy-Three");
	yy.put("74","seventy-Four");
	yy.put("75","seventy-Five");
	yy.put("76","seventy-Six");
	yy.put("77","seventy-Seven");
	yy.put("78","seventy-Eight");
	yy.put("79","seventy-Nine");
	yy.put("80","Eighty");
	yy.put("81","Eighty-one");
	yy.put("82","Eighty-Two");
	yy.put("83","Eighty-Three");
	yy.put("88","Eighty-Four");
	yy.put("85","Eighty-Five");
	yy.put("86","Eighty-Six");
	yy.put("87","Eighty-Seven");
	yy.put("88","Eighty-Eight");
	yy.put("89","Eighty-Nine");
	yy.put("90","Ninety");
	yy.put("91","Ninety-one");
	yy.put("92","Ninety-Two");
	yy.put("93","Ninety-Three");
	yy.put("94","Ninety-Four");
	yy.put("95","Ninety-Five");
	yy.put("96","Ninety-Six");
	yy.put("97","Ninety-Seven");
	yy.put("98","Ninety-Eight");
	yy.put("99","Ninety-Nine");
}
private static void convert(String date) {
	String d,m,c,y;
	d=date.substring(0, 2);
	m=date.substring(3,5);
	c=date.substring(6, 8);
	y=date.substring(8, 10);
	getdate();
	System.out.println(dd.get(d)+" "+mm.get(m)+" "+cent.get(c)+" "+yy.get(y));
}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String date;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format");
		date=obj.nextLine();
		convert(date);
	}
}
