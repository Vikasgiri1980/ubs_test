package com.test.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newWorkStealingPool();
		
		Future<String> future = executor.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println(" helllo");
				Thread.sleep(2000);
				return "vikas";
			}
		});
		
		
		Future<String> future1 = executor.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println(" helllo");
				Thread.sleep(2000);
				return "vikas1";
			}
		});
		
		
		//executor.shutdown();
		try {
			System.out.println(" Future Object " + future.get());
			
			//executor.shutdown();
			
			System.out.println(" Future1 Object " + future1.get());
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
