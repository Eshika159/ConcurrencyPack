package Callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



 class Example implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random r=new Random();
		int c=r.nextInt(9);
		return c;
	}

}
 public class CallableExample
 {
	 public static void main(String args[]) throws InterruptedException, ExecutionException
	 {
		 ExecutorService exec=Executors.newFixedThreadPool(1);
		 
		 for(int i=0;i<5;i++){
		 Future<Integer>f= exec.submit(new Example());
		 System.out.println(f.get());
		 } 
	}
	 
	 
	 
 } 
