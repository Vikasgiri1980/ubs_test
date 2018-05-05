package com.test.java9;

public class MyMergeShort {

	private int[] array;
    private int[] tempMergArr;
    private int length;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] inputArr = {45,23,11,89,77,98,4,28,65,43}; 
		   MyMergeShort m1 = new MyMergeShort();
		   m1.doSort(inputArr);
		   for(int i:inputArr) {
			   System.out.println( i);
			   System.out.print(" ");
		   }
		   

	}


	private void doSort(int[] inputArr) {
		
		this.array= inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0,length-1);
		
	}


	private void doMergeSort(int lowerIndex, int higerIndex) {
		
		
	}
	
	

}
