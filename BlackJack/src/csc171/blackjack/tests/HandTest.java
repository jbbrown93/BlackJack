/*
 * HandTest.java
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



import static org.junit.Assert.*;

import org.junit.*;

import csc171.blackjack.Hand;

//start of test class
public class HandTest {
	
	Hand hand = new Hand("Player", "Dealer");
	
	//NOTE: You MUST type in answer to prompt to continue to check other methods!!!
	
	@Test //should be prompted to hit or stay, returns that string
	public void testHitOrStay() {
		hand.hitOrStay();
	}//end method testHitorStay

	@Test //test getPlayerName method by comparing for equality
	public void testGetPlayerName() {
		
		assertEquals("Player", hand.getPlayerName());
	}//end of method testGetPlayerName

	@Test //compares for equality
	public void testSetPlayerName() {
		
		hand.setPlayerName("Jordan");
		assertEquals("Jordan", hand.getPlayerName());
	}//end method testSetPlayerName

	@Test //compares for equality
	public void testGetDealerName() {
		
		assertEquals("Dealer", hand.getDealerName());
	}//end method testGetDealerName

	@Test //test the setDealerName method by comparing for equality
	public void testSetDealerName() {
		
		hand.setDealerName("Jordan");
		assertEquals("Jordan", hand.getDealerName());
	}//end method testSetDealerName

	



	@Test
	public void testGameStatus() {
	
		int score1 = 26;
		int score2 = 21;
		int score3 = 17;
		int score4 = 2;
		int totalCards = 3;
		int totalCards2 = 5; 
		String name = "jordan";
		
		//check for bust
		assertEquals("Bust", hand.gameStatus(score1, totalCards, name));
		
		//check for win
		assertEquals("Win", hand.gameStatus(score2, totalCards, name));
		
		//check for charlie
		assertEquals("Charlie", hand.gameStatus(score3, totalCards2, name));
		
		//check for continue
		assertEquals("Continue", hand.gameStatus(score4, totalCards, name));
		
		
		
	}//end method testGameStatus

	
	

}//end of class HandTest
