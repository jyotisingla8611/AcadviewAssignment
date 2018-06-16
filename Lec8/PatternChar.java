/*Write a Java program to remove all vowels from the String. 4. Write a Java program to print the following pattern :
a 
ab 
abc */
package Assignment8;

public class PatternChar {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<i;j++)
			{
				char xyz;
				xyz=(char) (97+j);
				System.out.print(xyz);
			}
			System.out.println("");
		}

	}

}
