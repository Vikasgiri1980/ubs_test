package com.test.thread.callable;

import java.text.SimpleDateFormat;

public class ThreadLocal1 {

	
	private static ThreadLocal<SimpleDateFormat> formter = new ThreadLocal<SimpleDateFormat>() {
				
		@Override
		protected SimpleDateFormat initialValue() {
			
			return new SimpleDateFormat("yyyyMMdd");
		}
		
	};
	
}
