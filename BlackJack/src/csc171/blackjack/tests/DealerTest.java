/*
 * DealerTest.java
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

import java.util.ArrayList;

import org.junit.*;

import csc171.blackjack.Dealer;



//start of test class
public class DealerTest {
	
	//Initialize dealer object for testing
	
	Dealer dealerTest = new Dealer();
	
	
	@Test //Compare for equality to test the toString method
	public void testToString() {
		
		assertEquals("Dealer's card hand is: []", dealerTest.toString());
		
	}//end testToString

	@Test //test for equality with the getName method
	public void testGetName() {
		assertEquals("Dealer", dealerTest.getName());
		
	}//end testGetName

	@Test //Test for equality for the setName method
	public void testSetName() {
		
		dealerTest.setName("TheDealer");
		
		assertEquals("TheDealer", dealerTest.getName());
	}//end testSetName

	@Test //Test for true or false values for the dealerTurn method
	public void testDealerTurn() {
		int dealerScore1 = 15;
		int playerScore1 = 20;
		
		int dealerScore2 = 17;
		int playerScore2 = 1; 
		
		//If dealer's score is less than player's, it should return true
		assertTrue(dealerTest.dealerTurn(dealerScore1, playerScore1));
		
		//If dealer's score is greater than player's, it should return false
		assertFalse(dealerTest.dealerTurn(dealerScore2, playerScore2));
		
	}//end testDealerTurn

	@Test //Test the dealerAI method by testing for true and false values
	public void testDealerAI() {
		
		
		
		//The dealer's score is greater than the player's and player choose to stay, return false
		int dealerScore1 = 19;
		int playerScore1 = 2;
		String playerStays = "stays";
		
		assertFalse(dealerTest.dealerAI(dealerScore1, playerScore1, playerStays));
		
		
		
		//The dealer's score is equal to or greater than 17, and larger than the player's score
		//and the player did not choose to stay, return false
		int dealerScore2 = 17;
		int playerScore2 = 12;
		String playerDoesNotStay = null;
		
		assertFalse(dealerTest.dealerAI(dealerScore2, playerScore2, playerDoesNotStay));
		
		
		//The player's score is greater than 21, return false
		int playerScore3 = 25;
		
		assertFalse(dealerTest.dealerAI(dealerScore2, playerScore3, playerStays));
		
		//The dealer's score is exactly 21, return false
		int dealerScore3 = 21;
		
		assertFalse(dealerTest.dealerAI(dealerScore3, playerScore2, playerStays));
		
		//None of the conditions above are true, return true
		int dealerScore4 = 2;
		int playerScore4 = 3;
		
		assertTrue(dealerTest.dealerAI(dealerScore4, playerScore4, playerStays));
		
		
		
	}//end method testDealerAI

}//end of class DealerTest
