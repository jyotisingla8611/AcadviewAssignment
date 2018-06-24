/*Write a java program that sorts the list on the basis of age and name.*/
package Lec13;
import java.util.*;
class student
{
	Integer age;
	String name;
	public student(Integer a,String n)
	{
		age=a;
		name=n;
	}
}
class CompareName implements Comparator <student>{
    public int compare(student obj1, student obj2){
        return obj1.name.compareTo(obj2.name);
    }
}
class CompareAge implements Comparator <student>{
    public int compare(student obj1, student obj2){
        if(obj1.age > obj2.age)
            return 1;
        else if(obj1.age == obj2.age)
            return 0;
        else
            return -1;
    }
} 
public class Sort_on_2_properties {
	public static void main(String[] args) {
		ArrayList<student> a=new ArrayList<student>();
		student s1=new student(18,"jyoti");
		student s2=new student(16,"rajni");
		student s3=new student(24,"rahul");
		a.add(s1);
		a.add(s2);
		a.add(s3);
        System.out.println("Sorting Done By Name : \n");
        Collections.sort(a,new CompareName());
        for (student st : a) {
            System.out.println(st.name+" "+st.age);
        }
        System.out.println("\nSorting Done By Age : \n");
        Collections.sort(a,new CompareAge());
        for (student st : a) {
            System.out.println(st.name+" "+st.age);}
        
	}
}
