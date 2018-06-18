package Recursion;
import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {
		if( n== 0) {
			return 1;
		}
		
		int smallFact = fact(n-1);
		int ans = n * smallFact;
		return ans;
 		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));

	}

}