/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Emmanuel Key
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Blackjack!"); //welcome screen
    System.out.println("Would you like to check the rules? If so, type out 'Yes' or type out 'No' if otherwise.");
    String user = in.nextLine();
    if (user.equalsIgnoreCase("Yes")){
      String  names;
      System.out.println("");
      System.out.println("You are dealt 2 cards. The dealer is dealt 2 cards with one face-up and one hidden until the end.");
      System.out.println("Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
      System.out.println("You can Hit to gain another card from the deck. You can also Stand to keep your current card total.");
      //add stuff abt doubling, splitting etc.
      System.out.println("If you go over 21 you Bust, and the dealer wins regardless of the dealer's hand.");
      System.out.println("If your cards total to 21, you get Blackjack and win 1.5x of your bet");
      System.out.println("If both you and the dealer get Blackjack, you get your bet back.");
      System.out.println("If both you and the dealer Bust, the dealer wins and you lose your bet.");
      System.out.println("If you get BlackJack from the start, you win 1.5x of your bet");
      System.out.println("You win the pot if your cards beat the dealer's.");
      System.out.println("");
    }
      else if(user.equalsIgnoreCase("No")){

    }
    
    boolean replay = true;
    System.out.println("Would you like to play?");
    String Play = in.nextLine();
        if (Play.equalsIgnoreCase("yes")) {
            playBlackjack();           
        }
    /*while(replay == true){ //loops until user doesn't want to play again
      String playAgain = "q";
      String hit = "yes";
      if(Play.equalsIgnoreCase("yes")){
        //if user hand is 21 end game
        //show one of dealer's cards
        //repeat until user says stand:
        System.out.println("Would you like to hit?");//ask if user would like to hit
          hit = in.nextLine();
        while(hit.equalsIgnoreCase("yes")){
          //hit method 
          //show new card
          //bust method
          //blackjack method

        }
        
        //reveal hands
        //win or lose
      //at end of game:
        while(!playAgain.equalsIgnoreCase("yes") && !playAgain.equalsIgnoreCase("no")){ //loops until user types yes or no
        playAgain = "no";
        System.out.println("Would you like to play again?");
        playAgain = in.nextLine();
        if(playAgain.equalsIgnoreCase("yes")){
          replay = true;
          }
        else if(playAgain.equalsIgnoreCase("no")){
          replay = false;
          System.out.println("Goodbye!");
          System.exit(0);//end program
          }
        else{
          System.out.println("Please enter Yes or No"); 
          playAgain = "q";
          }
        }
      }
    else if(Play.equalsIgnoreCase("no")){
      System.out.println("Goodbye!");
      System.exit(0);//end program
    }
    else{
      System.out.println("Please enter Yes or No");
      Play = in.nextLine();
      }
    }*/
  
  }

  
    /*here is an algorithm I made for the rules:
    Create and shuffle a deck of cards
    Create two Hands, one for user and one for dealer
    Deal 2 cards into both hands
    Check if dealer has blackjack
    Check if user has blackjack
    User draws cards
    Dealer draws cards
    Check for winner */  
    public static void playBlackjack() {
    Hand userHand = new Hand();
    Hand dealerHand = new Hand();
    Deck deck = new Deck();
    Scanner in = new Scanner(System.in);
    Deck.shuffle();
    userHand.addCard(deck.draw());
    userHand.addCard(deck.draw());
    System.out.println("Dealing cards...");
    try {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    dealerHand.addCard(deck.draw());
    dealerHand.addCard(deck.draw());
    System.out.println("Your hand is: ");
    userHand.printHand();
    System.out.println("\n");
    
    try {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    if (userHand.hasBlackjack()) {
        System.out.println("You were dealt Blackjack! You win 1.5x of your bet!");
        //deal winnings
        //break
    }
    System.out.println("The dealer's one known card is: ");
    dealerHand.printDealerHand();
    System.out.println("\n");
    //first turn
    System.out.println("Would you like to hit, double, split, or stand?");
    String hitMe = in.nextLine();
    if (hitMe.equalsIgnoreCase("hit")) {
        userHand.addCard(deck.draw());
        System.out.println("Your hand is now: ");
        userHand.printHand();
        System.out.println("\n");
        if (userHand.hasBlackjack()) {
            System.out.println("You were dealt Blackjack! Now to see what the dealer can do...");
        //deal winnings
        //break
        }
    } else if (hitMe.equalsIgnoreCase("split")) {
        
        
    } else if (hitMe.equalsIgnoreCase("double")) {
        //wager * 2
        System.out.println("Your wager is now $"/* + wager*/);
    }else if (hitMe.equalsIgnoreCase("stand")) {
        
    }
    
    
    
    }
}
    

