/*
 * CardTest.java
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

import csc171.blackjack.Card;

//start of test class
public class CardTest {
	
	//Declare various Card objects to test
	Card card1 = new Card(1);
	Card card2 = new Card(5);
	Card card3 = new Card(10);
	Card card4 = new Card(5);

	

	@Test //Test the getValue method by using assertEquals
	public void testGetValue() {
		
		assertEquals(1 , card1.getValue());
		
		assertEquals(5 , card2.getValue());
		
		assertEquals(10, card3.getValue());
		
	}//end method testGetValue

	@Test //Test setValue method by setting cards to various values and testing for equality
	public void testSetValue() {
		
		card1.setValue(3);
		card2.setValue(9);
		
		assertEquals(3, card1.getValue());
		assertEquals(9, card2.getValue());
		
	}//end testSetValue method

	@Test //test toString method by comparing string objects for equality
	public void testToString() {
		
		assertEquals("10", card3.toString());
		
		assertEquals("5", card4.toString());
		
		assertEquals("1", card1.toString());
		
	}//end testToString

}//end of class CardTest
