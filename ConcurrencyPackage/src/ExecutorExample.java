import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
		// TODO Auto-generated method stub
		
	}
	
}

public class ExecutorExample {
	public static void main(String []args) throws InterruptedException
	{
		MyTask mt=new MyTask();
		
		ExecutorService ex=Executors.newFixedThreadPool(1);
		
		for(int i=0;i<20;i++)
		{
			ex.execute(mt);
			//Thread t=new Thread(mt);
			//t.start();
			//Thread.sleep(1000);
		}
		
		
	}
}
