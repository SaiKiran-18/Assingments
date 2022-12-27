package com.prime.java;

public class Bowler extends Player {
	int noOfWickets=25;
	String name="Bhumrah";
	String best="3/25";

	@Override
	void PlayerRecord() {
		System.out.println("The Bowler details are");
		System.out.println("The no of wickets taken:"+noOfWickets);
		System.out.println("The name of the Bowler is:"+name);
		System.out.println("The best was:"+best);
		
	}
	public static void main(String args[]) {
		Bowler bowl=new Bowler();
		bowl.PlayerRecord();
	}

}
