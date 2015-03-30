/*
 * PlayerTest.java
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
import csc171.blackjack.Player;



//start of test class
public class PlayerTest {

	//main method begins execution of Java application
	public static void main(String[] args) {
		
		
		
		System.out.println("First, the user should be prompted to enter their name.");

		//Initialize a Player object to test various methods
		Player player = new Player();
		
		//Testing toString method
		System.out.println("This should print out the user's name that was typed in and their card hand.");
		System.out.println(player);
		
		System.out.println();
		
		//Test the getName method
		System.out.println("This should retrieve the player's name.");
		System.out.println(player.getName());
		
		//Test the setName method
		System.out.println("This should set the player's name to a new name, Brianna. ");
		player.setName("Brianna");
		
		System.out.println("This should print the new name.");
		System.out.println(player.getName());
	}//end of main method

}//end of class PlayerTest
