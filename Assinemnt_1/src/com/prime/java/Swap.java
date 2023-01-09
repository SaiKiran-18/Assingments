package com.prime.java;
import java.lang.Exception;
import java.util.Scanner;
public class Swap {
	public static void main(String args[]) {
		try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a=scan.nextInt();
	System.out.println("Enter the value of b");
	int b=scan.nextInt();
	System.out.println("After swaping the numbers");
	a=(a+b);
	b=a-b;
	a=a-b;
	System.out.println("The values are as follows");
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("please enter the integer values");
		}
	finally {
		System.out.println("The code is completed");
	}
	}
}