package com.prime.java;
import java.util.*;
public class CheckPalindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			String reverse="";
			System.out.println("Enter the number");
			String value=sc.nextLine();
			int length=value.length();
			for(int i=length-1;i>=0;i--) {
				reverse=reverse+value.charAt(i);
			}
			if(value.equals(reverse)) {
				System.out.println("The given value is palindrome");
			}
			else {
				System.out.println("The given value is not a palindrome");
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("The test is completed");
		}
	}
}
			
			
						
