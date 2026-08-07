package com.learning.vcube;

import java.util.Scanner;

public class CricketPlayer {
	
	private String PlayerName;
	private int MatchesPlayed;
	private int TotalRuns;
	
	CricketPlayer(String PlayerName, int MatchesPlayed, int TotalRuns){
		
		this.PlayerName = PlayerName;
		this.MatchesPlayed = MatchesPlayed;
		this.TotalRuns = TotalRuns;
	}
	
     void calculate() {
		
		double AverageRuns = (TotalRuns / MatchesPlayed);
		System.out.println("Player Name : " + PlayerName);
		System.out.println("Matches Played : " + MatchesPlayed);
		System.out.println("Total Runs :" + TotalRuns);
		System.out.println("Average Runs : " + AverageRuns);
	}
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Player name: ");
		String name = sc.next();
		
		System.out.println("Enter Matches player :");
		int player = sc.nextInt();
		
		System.out.println("Enter Total Runs :");
		int run = sc.nextInt();
		
		CricketPlayer c = new CricketPlayer(name, player, run);
		c.calculate();
		
	}

}
