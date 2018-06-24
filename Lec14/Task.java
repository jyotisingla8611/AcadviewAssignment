package Lec14;
public class Task implements Runnable {
	@Override
	public synchronized void run() {
		int i=1;
       while(i<1001)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error Occurres");
			}
			i++;
		}	
	}
}
