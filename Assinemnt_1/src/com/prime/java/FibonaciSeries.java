package com.prime.java;
import java.util.Scanner;
import java.lang.Exception;
public class FibonaciSeries {
	public static void main(String args[]) {
		try {
			int n1=0,n2=1,i=2,n3;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
			while(i<=number) {
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				i++;
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Enter the valid integers to get series");
		}
		finally {
			System.out.println("The code is completed");
		}
	}
}
