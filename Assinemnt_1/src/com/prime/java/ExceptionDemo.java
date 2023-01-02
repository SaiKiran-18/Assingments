package com.prime.java;
import java.util.Scanner;
import java.lang.*;
public class ExceptionDemo{
	public static void main(String args[]) {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a value");
	int a=sc.nextInt();
	System.out.println("Enter the value of b");
	int b=sc.nextInt();
	int c=a/b;
	System.out.println(c);
	System.out.println("Enter the name of person");
	String name=sc.nextLine();
	//sc.nextLine();
	System.out.println("Enter the name of person2");
	String name2=sc.nextLine();
	String d=name+name2;
	System.out.println(d);
	System.out.println("Enter the value of num1");
	double num1=sc.nextDouble();
	System.out.println("Enter the value of num2");
	double num2=sc.nextDouble();
	double num3=num1/num2;
	System.out.println(num3);
	
	}
	catch(Exception e) {
		System.out.println(e.toString());
		System.out.println("Always enter a and b value greater than zero");
	}
	finally {
		System.out.println("I will print all statements in my block");
	}
}
}
