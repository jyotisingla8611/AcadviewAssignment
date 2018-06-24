/* Create a multi-threaded program with a synchronised method to print values from 1 to 1000 using 2 threads.*/
package Lec14;

public class Multithreading {

	public static void main(String[] args)  {
		Task task1=new Task();
		Thread t1= new Thread(task1);
		Thread t2= new Thread(task1);
		t1.start();
		t2.start();
	}

}