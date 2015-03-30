/*
 * DeckOfCardsTest.java
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
import csc171.blackjack.DeckOfCards;

//start of test class
public class DeckOfCardsTest {

	//main method begins execution of Java application
	public static void main(String[] args) {

		//Initialize DeckOfCard objects for various testing

		DeckOfCards deck = new DeckOfCards();
		
		//Test each method in the deck of cards, as outlined in the print statements
		System.out.println("The size of the deck should be 52.");
		System.out.println("Check size: " + deck.getDeckSize());
		
		System.out.println();
		
		System.out.println("This should produce random cards in deck: ");
		System.out.println("Check random cards: " + deck.getRandomCard() + " " + deck.getRandomCard());
		
		System.out.println();

		System.out.println("Here is the current deck: " + deck);
		deck.shuffleDeck();
		System.out.println("Here is the shuffled deck: " + deck);
		
		System.out.println();
		
		System.out.println("This should be equivalent to the deck above, the accessor method: " + "\n" 
				+ deck.getDeck());
		
		System.out.println();
		
		System.out.println("This should deal a random card from the deck and the deck should be smaller.");
		System.out.println("The current deck size is: " + deck.getDeckSize());
		
		Card newCard = deck.dealCard();
		
		System.out.println("Here is the card drawn: " + newCard);
		System.out.println("Here is the new deck size: " + deck.getDeckSize());
		
		System.out.println();
		
		System.out.println("This is the toString method Test. It should say: " 
				+ "Current deck of cards: " + "\n<deck>");
		System.out.println(deck);
		
		System.out.println();
		
		ArrayList< Card > newDeck = new ArrayList< Card > ();
		
		deck.setDeck(newDeck);
		System.out.println("This should set the above deck to new, empty deck: " + "\n" +
				deck);
		
	}//end of main method

}//end of class DeckOfCardsTest
