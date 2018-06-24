/*  Write a Java program to compare two sets and retain elements which are same on both sets.*/
package Lec12;

import java.util.*;

public class CompareSets {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<Integer>();
		Set<Integer> s2=new LinkedHashSet<Integer>();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 5 numbers to  be added to set1");
		for(int i=0;i<5;i++)
		{
			int num=obj.nextInt();
			s1.add(num);
		}
		System.out.println("Enter 5 numbers to  be added to set2");
		for(int i=0;i<5;i++)
		{
			int num=obj.nextInt();
			s2.add(num);
		}
		int count=0;
		for(Integer s3:s1)
		{
			if(s2.contains(s3))
				count++;
		}
		if(count==s1.size())
			System.out.println("Sets are equal");
		else
			System.out.println("Sets are unequal");
		s1.retainAll(s2);
		System.out.println("Retaining same elements we get : "+s1);
	}

}
