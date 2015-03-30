/*
 * PlayersHandTest.java
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
import csc171.blackjack.PlayersHand;

//start of test class
public class PlayersHandTest {

	//start of main method
	public static void main(String[] args) {
		
		PlayersHand player = new PlayersHand();
		
		Card card1 = new Card(1);
		
		//Test the addCard method
		System.out.println("This should add a new card of '1' to the array list");
		player.addCard(card1);
		System.out.println(player);
		
		System.out.println();
		
		//Test the getHand method
		System.out.println("This should retrieve the players hand. Which is [1]");
		System.out.println(player.getHand());
		
		//Test the setHand method and toString method
		System.out.println("\nThis should set the players hand to an empty hand array Card list");
		ArrayList< Card > newplayer = new ArrayList< Card >();
		player.setHand(newplayer);
		System.out.println(player);
		
		System.out.println();
		
		//Test getNumOfCards method
		System.out.println("This should retrieve the number of cards in hand which is 0");
		System.out.println(player.getNumOfCards());
		
		

	}//end of main method

}//end of class PlayersHandTest
