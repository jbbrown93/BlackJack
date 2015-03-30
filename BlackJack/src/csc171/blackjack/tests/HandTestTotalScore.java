/*
 * HandTestTotalScore.java
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

package csc171.blackjack.tests;


import java.util.ArrayList;

import csc171.blackjack.Card;
import csc171.blackjack.Hand;
import csc171.blackjack.PlayersHand;

//start of class
public class HandTestTotalScore {

	//start of main method
	public static void main(String[] args) {
		
		Hand hand = new Hand("Player", "Dealer");
		PlayersHand player = new PlayersHand();
		ArrayList< Card > playerHand = player.getHand();
		
		//Checks the totalScore method in class Hand
		
		Card card1 = new Card(1); 
		Card card2 = new Card(5);
		Card card3 = new Card(8);
		
		
		player.addCard(card1);
		player.addCard(card2);
		player.addCard(card3);
		
		//Check that the Ace is counted correctly
		System.out.println("The total score should account for the Ace and be 14");
		System.out.println(hand.totalScore(playerHand));
		
		Card card4 = new Card(1);
		Card card5 = new Card(9);
		Card card6 = new Card(7);
		
		
		PlayersHand dealer = new PlayersHand();
		ArrayList< Card > dealerHand = dealer.getHand();
		
		dealer.addCard(card4);
		dealer.addCard(card5);
		dealer.addCard(card6);
		
		System.out.println("\nThe total score should account for the Ace and be 17");
		System.out.println(hand.totalScore(dealerHand));
		

	}//end main method

}//end of class HandTestTotalScore
