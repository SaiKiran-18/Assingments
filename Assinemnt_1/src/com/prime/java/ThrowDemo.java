package com.prime.java;
import java.io.IOException;
import java.util.Scanner;
public class ThrowDemo {
	Scanner sc=new Scanner(System.in);

	public void checkEven() throws  IOException {
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2 != 0) {
			throw new IOException("please enter valid number");
		}
		else {
			System.out.println("The given number is even");
		}
	}
	public static void main(String args[])throws IOException{
		ThrowDemo demo=new ThrowDemo();
		demo.checkEven();
	}
	
	

}
