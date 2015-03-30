# BlackJack
Java program that simulates a single player card game of BlackJack, between the user and computer.

##Class Design:

I designed my classes with High Cohesion and Low Coupling in mind.
I made the purpose of each of my classes very specific and created them to have low dependencies. 


###BlackJack

Contains the main method that orchestrates and runs the game of Black Jack. Also contains a method that gives the user the 
option to either play again or quit.  


###Card

Represents an individual card, that has an integer value. 

e.g. 

Cards can have the value of 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10, 10, 10

Aces have a value of either 1 or 11

Jack, King, and Queens are represented by a value of 10
(This means you are three times as more likely to draw a '10' than any other card)

###DeckOfCards

Represents a standard deck of 52 cards. This class can shuffle, deal, and display the initial 
draw for each player.

###Hand

This class determines the status and score of each player based on the rules of the game. This class knows both the name
of the dealer and player, and can declare either a winner or draw. 

###PlayersHand

A Parent class that represents an arbitrary player's current hand. This class knows how to add cards, retrieve the number of
cards in hand, and can print out the information. 

###Player

A child class of PlayersHand that represents the human player of the game. This class prompts the user for their name, 
and keeps track of their hand. 

###Dealer

A child class of PlayersHand that represents the dealer of the game. The dealer is the computer and was created using 
a simple Artificial Intelligence algorithm that makes strategic decisions based on the user's performance and the rules 
of the game. 


##Decisions Concerning Inheritance:

To minimize code duplication, I created a Parent class, called PlayersHand, which contains all the 
methods that are needed for an arbitrary player's hand, such as adding and accessing cards. The child classes of 
PlayersHand, Dealer and Player (representing the dealer and human player of the game, respectively), 
inherit the state and behavior of PlayersHand, but also have added additional information that are 
specific to the Player and Dealer. For instance, the Dealer implements an Artificial Intelligence algorithm, while the 
Player uses a Scanner object in its constructor that prompts the human player to enter their name. 
In the children classes, I also overrided the parent's toString method, to make the toString method
more useful to the children. Although I did not need to use the super reference in the children's 
constructors since the parent's constructor is parameterless, I wanted to explicitly call the super
keyword to make it clear that the child class is inheriting the parent's state and behavior. 


##BlackJack Algorithm Implementation: 

For my algorithm implementation, I used the Top-Down, Stepwise Refinement Process. I first wrote the 
problem as one, 'top', sentence: simulate a single player game of BlackJack, between the user and 
computer. Then, I imagined playing one full game of BlackJack, and wrote down all the necessary steps 
that happen during the game from beginning (e.g. Asking the player for name, shuffling deck) to end 
(e.g. declaring a winner, asking the player whether they want to play again). Next, I took each, 
individual step, and did my 'first refinement' by dividing the step into a series of smaller task and
listing them in the order they would happen. Then I broke this down further, my 'second refinement', 
and added variable names. I then translated the algorithm into Java code. 


##Testing Strategy:

For my testing strategy , I used JUnit and my own written test classes to test for bugs. For my JUnit
test classes, I tested for equality in objects and truth or false values for boolean methods.
To make sure I accounted for all errors, I tried all the different possibilities for various methods. 
For my custom made test classes, I used various print statements and calling of methods to see if the 
values matched and the output was what I expected. 


##Instructions on running code: 

```
 Move project file to Desktop
 Open Command Prompt window
 Enter cd <Desktop>
 Enter cd <Lab file name>
 Enter javac -cp -d <destination folder where .class files are stored> <path to the .java files>
 
 Do not include angle brackets.
```


To compile my package from the command line:
	
 	Enter javac -cp. -d c:\workspace\lab06\bin csc171\blackjack\*.java
	Enter javac -cp. -d c:\workspace\lab06\bin csc171\blackjack\tests\*.java
	

To run class from command line: 
	
	NOTE: Make sure to run the java main method class called BlackJack
	
	Enter java -cp.csc171.blackjack.BlackJack


The Prompts the user will be asked:

```
  Enter your name: <type in name and press enter>
  
 <name>, would you like to choose to ''Hit'' or ''Stay'': <Type in 'hit' or 'stay', ignores case>

 
 Enter the word 'yes' to play again, or anything else to end the game: <Type 'yes', ignores case>
 																		<Type anything else to quit>
 	NOTE: You MUST type in the full word 'yes' but case doesn't matter.

Do not include angle brackets

```

##Instructions on running test code: 

###For the following test classes:

```
  BlackJackTest, DeckOfCardsTest, HandTestIsWin (specific for testing the Hand isWin method),
  PlayersHandTest, PlayerTest, and HandTestTotalScore (specific for the Hand class' totalScore method)
  	
   
1. Move project file to Desktop
2. Open Command Prompt window
3. Enter cd <Desktop> 
4. Enter cd <Lab file name> 
5. Enter javac -cp -d <destination folder where .class files are stored> <path to the .java files>

Do not include angle brackets
```

To compile my test package from the command line:
	
	Enter javac -cp. -d c:\workspace\lab06\bin csc171\blackjack\tests\*.java
	

To run class from command line: 
```	
   Enter java -cp.csc171.blackjack.tests.BlackJackTest
   Enter java -cp.csc171.blackjack.tests.DeckOfCardsTest
   Enter java -cp.csc171.blackjack.tests.HandTestIsWin
   Enter java -cp.csc171.blackjack.tests.PlayersHandTest
   Enter java -cp.csc171.blackjack.tests.PlayerTest
   Enter java -cp.csc171.blackjack.tests.HandTestTotalScore
```
```
#For the BlackJackTest, user will be prompted
7. Enter the word 'yes' to play again, or anything else to end the game: <type in for string input>

#For the PlayerTest, user will be prompted 
8. Enter your name: <type in for string input>

Do not include angle brackets
```

###For the following JUnit Classes:
NOTE: For JUnit 4.X

``` 
 - CardTest, DealerTest,   and 
 HandTest (You MUST answer the prompt in command line for the HandTest to continue testing!!)

1. Move project file to Desktop
2. Open Command Prompt window
3. Enter cd <Desktop> 
4. Enter cd <Lab file name>
5. Move down directories to find the directory where the JUnit test classes are located
6. Compile the Test class and the Runner class
7. Run the JUnit Runner
```
EXAMPLES: 

To compile the JUnit test classes

	e.g
	javac -cp .;c:\junit\junit4.jar TestJUnit4.java
	
To run the JUnit test classes

	e.g.
	java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore <Test class name>
