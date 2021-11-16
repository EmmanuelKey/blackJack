/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.ArrayList;

/**
 *
 * @author Emmanuel Key
 */
public class Hand {
  ArrayList<Card> hand = new ArrayList<Card>();
  //add card (hit)
  public void addCard(Card c) {
    hand.add(c);
  }
  //get sum
  public int getGameSum() {
    int sum = 0;
    //int aceNum = 0;
    for(int i = 0; i < hand.size(); i++) {
      if (this.hand.get(i).getValue() >= 11) {
          sum += 10;
      }
      if (this.hand.get(i).getValue() == 1) {
          sum += 11;
          //aceNum++;
          if (this.isBusted()) {
              sum -= 10;
          }
      }
      else {
          sum += this.hand.get(i).getValue();
      }
    }
    return sum;
  }
  public int getSum() {
      int sum = 0;
      for (int i = 0; i < hand.size(); i++) {
          sum += hand.get(i).getValue();
      }
      return sum;
  }
  
  public boolean hasBlackjack() {
    if(this.getGameSum() == 21) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isBusted() {
      if (this.getSum() > 21) {
          return true;
      }
      return false;
  }

  public void printHand() {
    for(int i = 0; i < hand.size(); i++) {
      System.out.print(hand.get(i).getValueName() + " of " + hand.get(i).getSuit() + "    ");
    }
  }
  public void printDealerHand() {
    for(int i = 0; i < hand.size()-1; i++) {
      System.out.print(hand.get(i).getValueName() + " of " + hand.get(i).getSuit() + "    ");
    }
  }
  //check hand method
  /*public static boolean checkHand() {
    if(getSum == 21) {
      return true;
    }
    else {
      return false;
    }
  }*/
}
