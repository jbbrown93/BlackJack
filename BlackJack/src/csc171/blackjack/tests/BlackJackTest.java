/*
 * BlackJackTest.java
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
import csc171.blackjack.BlackJack;


//start of test class
public class BlackJackTest {

	//start of main method
	public static void main(String[] args) {
		
		BlackJack BlackJack = new BlackJack();
		
		//test method playAgain
		System.out.println("User should be prompted to type answer whether to play again or not");
		BlackJack.playAgain();
		

	}//end of main method

}//end of class BlackJackTest
