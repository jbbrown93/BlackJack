/*
 * Card.java
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

package csc171.blackjack;


//start of class
public class Card {

	//Declare an integer instance variable that represents the Card's value
	private int value;
	
	//Create constructor and initialize instance variable, value
	public Card(int value){
		
		this.value = value;
		
	}//end of Card constructor 
	
	//Accessor for the instance variable, value
	public int getValue(){
		
		return value;
		
	}//end of method getValue
	
	//Mutator for the instance variable, value
	public void setValue(int value){
		
		this.value = value;
		
	}//end of method setValue
		
	
	@Override //Override default toString method
	
	//Return a string of the Card's value
	public String toString(){
		
		return getValue() + "";
			
	}//end of method toString
	
}//end of class Card