package com.test.java9;

import java.util.Iterator;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermImplementation obj = new PermImplementation();
		if(obj instanceof Perm) {
			System.out.println(" Print the value of obj " + obj.printSomehting());
		} else {
			System.out.println(" sorry no perm " + obj.printSomehting());

		}
	
		
		//int num = 123063795;
		print(123063795);
		quiz(10);
		}
		
	

public static void print(int num)
{
int dig = num - (num/10) * 10;
if(dig == 0)
return;
if(dig % 3 == 0)
System.out.print(""+dig);
print(num/10);
}


public static void quiz(int i)
{
if (i > 1)
{
quiz(i / 2);
quiz(i / 2);
}

System.out.println("*");

}


}





