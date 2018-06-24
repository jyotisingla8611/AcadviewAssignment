/* Write a Java program to associate the specified value with the specified key in a HashMap.*/
package Lec12;

import java.util.*;

public class HashMaping {

	@SuppressWarnings({ "rawtypes", "resource" })
	public static void main(String[] args) {
    Map<String,String> map =new HashMap<>();
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter key values");
   String key = null;
   String value;
   String quit="quit";
   key=obj.nextLine();
   while(!(key.equals(quit)))
	   {
		 value=obj.nextLine();
		  map.put(key, value);
	   key=obj.nextLine();
   }
   
   for(Map.Entry maps:map.entrySet()) {
		System.out.println("Key : "+maps.getKey()+"    Value : "+maps.getValue());
	}
	}

}
