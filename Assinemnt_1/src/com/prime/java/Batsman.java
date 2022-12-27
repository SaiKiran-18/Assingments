package com.prime.java;

public class Batsman extends Player {
	int runs=7000;
	String name="M.S.Dhoni";
	double average=60.4;
	int bestScore=174;
	@Override
	void PlayerRecord() {
		System.out.println("The Batsman details are as follows");
		System.out.println("The batsman name is:"+name);
		System.out.println("The batsman runs are:"+runs);
		System.out.println("The batsman average is:"+average);
		System.out.println("The batsman best score is:"+bestScore);
	}
	public static void main(String args[]) {
	 Batsman bat=new Batsman();
	 bat.PlayerRecord();
	}

}
