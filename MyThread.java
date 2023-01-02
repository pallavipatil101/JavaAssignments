package assignment.two;

//Write a program which will create two threads and print the 10 numbers in sequence.
public class MyThread2 {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
		{
			public void run() {
			for(int i=1; i<=10; i++) 
			{
				if(i%2==0)
				{
				System.out.println(i);
				try {Thread.sleep(500);} catch(Exception e) {}
			}
			}
		}
		};		
		Runnable obj2 = new Runnable()
		{
			public void run() {
			for(int i=1; i<=10; i++) 
			{
				if(i%2!=0)
				{
				System.out.println(i);
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
			}
		}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();


	}

}
