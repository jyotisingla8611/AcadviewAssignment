package Lec11;
public class Stack {
	private int arr[];
	  private  int top;
	  public Stack() {
			arr = new int[5];
		}
	 public void push(int element) {
		if (top == arr.length) {
			reconstruct();
		}
		arr[top] = element;
		top++;
	}
	public void reconstruct() {
		int temp[] = arr;
		arr = new int[(int) (arr.length * 1.5)];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
	}
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	public int size() {
		return top;
	}
	public int pop() {
		
		int value = arr[top - 1];
		top--;
		return value;
	}
}
