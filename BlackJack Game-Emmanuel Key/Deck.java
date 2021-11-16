/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Emmanuel Key
 */
public class Deck {
  static Random random = new Random();   
  private static ArrayList<Card> cards; 

  public Deck() {
    //initializes deck with complete card values
    this.cards = new ArrayList<Card>();
    int z = 0;
    for(int i = 0; i < 4; i++) {
      for(int k = 1; k < 14; k++) {
        this.cards.add(new Card(i, k));
        }
      }
  }  
  //draw card
  public Card draw() {  
    int index = ThreadLocalRandom.current().nextInt(0, cards.size());
    return cards.remove(index);
  }
  //shuffle method
  public static void shuffle() {
      Collections.shuffle(cards, new Random());
  }
  /*public static void printDeck() {
      System.out.println(cards);
  }*/
  
  
}

