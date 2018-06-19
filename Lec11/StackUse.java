package Lec11;

public class StackUse {

	public static void main(String[] args) {
		Stack s = new Stack();
		for (int i = 0; i <= 10; i++) {
			s.push(i);
			
		}	
		while (!s.isEmpty())  {
			System.out.println(s.pop());
		}

	}

}
