package com.test.thread.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallabaleThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method 
		
		System.out.println(" hello");
		Random generator = new Random();
		 
        Integer randomNumber = generator.nextInt(5);
 
        // To simulate a heavy computation,
        // we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);
			
		return randomNumber;
	}
	
	

	

}
