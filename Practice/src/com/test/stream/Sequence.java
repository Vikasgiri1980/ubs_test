package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
	
	String temp = "000", binary;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("helo");
			List alist = binarySequence(1);
			alist.stream().forEach(System.out::println);

	}

	public static List<String> binarySequence(final int length) {
	    final int noOfItems = 1 << length;
	    final List<String> sequences = new ArrayList<>(noOfItems);
	    final String format = "%" + length + "s";
	    for (int num = 0; num < noOfItems-1; num++) {
	        final String binary = String.format(format,
	                Integer.toBinaryString(num)).replace(' ', '0');
	        sequences.add(binary);
	    } 
	    return sequences;
	}

	
}
