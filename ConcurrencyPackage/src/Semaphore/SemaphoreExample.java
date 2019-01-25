package Semaphore;

import java.util.concurrent.Semaphore;

class Shared
{
static int count=0;	
}
class MyThread extends Thread{

	String name;
	Semaphore s;
	MyThread(String name,Semaphore s)
	{	super(name);
		this.name=name;
		this.s=s;
	}
	public synchronized void run()
	{	
		if(Thread.currentThread().getName().equals("A")){
//			try {
//				//s.acquire();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
			for(int i=0;i<5;i++)
			{
				//releasing the resources
				Shared.count++;
				System.out.println(Thread.currentThread().getName()+"---- "+Shared.count);
				
			}
			
		//	s.release();

			System.out.println("Available resources: "+Shared.count);
		
			System.out.println("Thread"+Thread.currentThread().getName() + " released resources now other can access");
				
		}
		else
		{
//			try {
//				//s.acquire();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			for(int i=0;i<5;i++)
			{
				//releasing the resources
				Shared.count--;
				System.out.println(Thread.currentThread().getName()+"---- "+Shared.count);
				
			}
			
			//s.release();
			System.out.println("Thread"+Thread.currentThread().getName() + "Using resources");
			
		}
		System.out.println("Available resources: "+Shared.count);
		
	}
	
}
public class SemaphoreExample {
	
	public static void main(String []args) throws InterruptedException
	{
		Semaphore s=new Semaphore(1);
		
		MyThread t1=new MyThread("A",s);
	    //MyThread t3=new MyThread("A",s);
		MyThread t2=new MyThread("B",s);
		t1.start();
		
		
		//t3.start();
		//t3.join();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Available resources: in the end "+Shared.count);
	
	}

}
