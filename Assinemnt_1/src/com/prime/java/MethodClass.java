package com.prime.java;

public class MethodClass {
	private int data=34;
	public void Meth1() {
		class Inner{
			public void Meth2() {
				System.out.println("The data is:"+data);
			}
		}
		Inner inner=new Inner();
		inner.Meth2();
	}
	

	public static void main(String args[]) {
		MethodClass method=new MethodClass();
		method.Meth1();
		
	}
	}
