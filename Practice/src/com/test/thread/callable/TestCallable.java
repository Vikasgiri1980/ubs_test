package com.test.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	
	private static final ExecutorService pool = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) throws Exception {
		
		
		 
	
		Future<Integer> intValue = startComputaion("hello");
		int i =0;
		while(!intValue.isDone()) {
			//System.out.println("Please wait ...." + i);
			i ++;
		}
		System.out.println("vaile of i " +i);
		
		System.out.println("Your value" +  intValue.get());
		pool.shutdown();
		
		/*if(intValue.isDone()) {
			System.out.println( "Please wait ...");
		} else {
			System.out.println("Your value" +  intValue.get());
		}
		*/
		
		
	// CallabaleThread t1 = new CallabaleThread();
	//pool.submit(t1);
		
	}
	
	
	public static Future<Integer> startComputaion(String url) {
		
		System.out.println(" Hello >>>>>>");
		
		return pool.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				
				
			
				System.out.println(" CurrentThreadName " + Thread.currentThread().getName());
				int i =98;
				i = 98*76; 
				Thread.sleep(1000);
				System.out.println(" CurrentThreadName " + Thread.currentThread().getName());
				i= i*i;
				Thread.sleep(100);
				System.out.println(" CurrentThreadName " + Thread.currentThread().getName());
				
				
				return 5*999999*999999*999999*999999*9876*i;
			}
			
		});
		
	}
	
    public static  int sequentialSum()

    {                      

                //long t1 = System.currentTimeMillis();

                Integer totsum=0;                        

                for(int i=0;i<100;i++)

                {

                    totsum=totsum+i;                                               

                }                       

                //long t2 = System.currentTimeMillis();                       

                System.out.println("sequentialSum Total Sum is " + totsum);

                //System.out.println("Time taken by sequentialSum " + (t2-t1));

                return totsum;

    }           

}
