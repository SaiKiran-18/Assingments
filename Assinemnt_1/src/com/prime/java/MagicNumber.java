//The below program will check  the given number magical  or not which only use divisor "10"
//like examples are 5311,7210,631,etc...
package com.prime.java;
import java.util.Scanner;
import java.lang.Exception;
public class MagicNumber {
	public static void main(String args[]) {
	try {
		int rem=0,quo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the divided");
		int divided=sc.nextInt();
		System.out.println("Enter the divisor");
		int divisor=sc.nextInt();
		while(divided>divisor) {
			rem=rem+(divided%divisor);
			quo=(divided/divisor);
			divided=quo;
			}
			if(rem+quo==10) {
				System.out.println("The given number is a magic number");
		}
			else {
				System.out.println("The given number is not a magic number");
			}
	}
	catch(Exception e) {
		System.out.println(e.toString());
		System.out.println("The divisor and divided must be an integers");
	}
	finally {
		System.out.println("The magic code is completed");
	}
	}
}
	
