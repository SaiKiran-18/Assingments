package com.prime.java;
import java.util.Scanner;

public class MultiException {
	public static void main(String args[]) {
	try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
	try {
		if(a%2 == 0) {
			System.out.println("The given number is even");
		}
	}
	catch(Exception e) {
		System.out.println("please give a value divisibe by 2");
	}
	finally {
		System.out.println("The even block is completed");
	}
	try {
		if(b%2 == 1) {
			System.out.println("The given number is odd");
		}
	}
	catch(Exception e) {
		System.out.println("please give a value which remainder is 1");
	}
	finally {
		System.out.println("The odd block is completed");
	}
	
	}
	catch(Exception e) {
		System.out.println(e.toString());
		
	}
	finally {
		System.out.println("The entire code is completed");
	}

}
}
	
