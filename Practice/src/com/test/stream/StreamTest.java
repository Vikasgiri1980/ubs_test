package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
         
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
         
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
 
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		
        listOfListofInts.stream().map(t->t).flatMap(List::stream).filter(t-> t > 3).forEach(System.out::println);
		
      //  listOfListofInts.stream().flatMap(List::stream).filter(t-> t<8).forEach(System.out::println);
		
		//alist.stream().flatMap(List::stream).forEach(System.out::println);
		
		
		
		//List<Integer> aNumlist = Arrays.asList(13,2,15,23,9,7,16,25,13,19);
		
		//aNumlist.stream().forEach(System.out::println);
		//aNumlist.stream().filter(t-> t > 13).forEach(System.out::println);
		//aNumlist.stream().filter(t-> t > 13).map(t-> t*2).forEach(System.out::println);
		
		
		
		//List<String> alist = Arrays.asList("vikas","vishal","ajay","jimy","sangeeta","poshu","poshu","pooja");
		 //alist.stream().forEach(System.out::println);
		 // alist.parallelStream().forEach(System.out::println);
		// alist.stream().map(t-> t.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		 //int i = (int) alist.stream().filter(t-> t.startsWith("v")).count();
		 //System.out.println("Count ::" + i);
		 //alist.stream().filter(t-> t.startsWith("po")).distinct().map(t-> t.toUpperCase()).forEach(System.out::println);
	
	} 

}
