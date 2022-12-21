package com.prime.java;

	public class Prime {
		public boolean  Check(int n) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;	
		}
	public static void main(String args[]) {
		Prime prime=new Prime();
		if(prime.Check(673)) {
			
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
	}


