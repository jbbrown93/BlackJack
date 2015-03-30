package csc171.blackjack.tests;
/*
 * HandTestIsWin.java
 * 
 * Version 7
 * 
 * Copyright Jordan Brown
 * 
 * Course: CSC 171 SPRING 2015
 * 
 * Project: BlackJack
 * 
 * Last Revised: March 29th, 2015
 */

import csc171.blackjack.Hand;



//start of class
public class HandTestIsWin {

	//start of main method
	public static void main(String[] args) {
		
		//Testing the isWin method for different possible wins
		String playerStatus1 = "Bust";
		String dealerStatus1 = "Bust";
		
		String playerStatus2 = "Continue";
		String dealerStatus2 = "Continue";
		
		int dealerScore1 = 16;
		int playerScore1 = 12;
		
		int dealerScore2 = 11;
		int playerScore2 = 16;
		
		Hand hand = new Hand("Jordan", "Dealer");
		
		//Test each possible win, draw, and bust
		
		System.out.println("\nThis should print: 'Jordan Busts! Dealer won!'");
		System.out.println(hand.isWin(playerStatus1, dealerStatus1, dealerScore2, playerScore2));
		
		System.out.println("\nThis should print: 'It's a draw'!");
		System.out.println(hand.isWin(playerStatus2, dealerStatus2, dealerScore1, playerScore2));
		
		System.out.println("\nThis should print: The winner is Dealer ");
		System.out.println(hand.isWin(playerStatus2, dealerStatus2, dealerScore1, playerScore1));
		
		System.out.println("\nThis should print: The winner is Jordan");
		System.out.println(hand.isWin(playerStatus2, dealerStatus2, dealerScore2, playerScore2));
		
		System.out.println("\nThis should print: Dealer Busts! Jordan won!");
		System.out.println(hand.isWin(playerStatus2, dealerStatus1, dealerScore1, playerScore2));

	}//end main method

}//end of class HandTestIsWin
