package com.prime.java;
import java.util.Scanner;
class NewThread extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			for(int i=0;i<=number;i++) {
				NewThread thread=new NewThread();
				thread.start();
				thread.run();
			}
		}
	}
	
