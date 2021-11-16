/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Emmanuel Key
 */
public class Card {
  private int suit; //Clubs = 0, Spades = 1, Hearts = 2, Diamonds = 3
  private int number;
  public Card(int suit, int number) {
    this.suit = suit;
    this.number = number;
  }

  public String getSuit() {
    if(suit == 0) {
      return "Clubs";
    }
    if(suit == 1) {
      return "Spades";
    }
    if (suit == 2) {
      return "Hearts";
    }
    if (suit == 3) {
      return "Diamonds";
    }
    return null;
  }
  
  public String getValueName() {
    String name = "Unknown";
    if(this.number == 1){
      name = "Ace";
    }
    else if(this.number == 2){
      name = "2";
    }
    else if(this.number == 3){
      name = "3";
    }
    else if(this.number == 4){
      name = "4";
    }
    else if(this.number == 5){
      name = "5";
    }
    else if(this.number == 6){
      name = "6";
    }
    else if(this.number == 7){
      name = "7";
    }
    else if(this.number == 8){
      name = "8";
    }
    else if(this.number == 9){
      name = "9";
    }
    else if(this.number == 10){
      name = "10";
    }
    else if(this.number == 11){
      name = "Jack";
    }
    else if(this.number == 12){
      name = "Queen";
    }
    else if(this.number == 13){
      name = "King";
    }
    return name;
  }

    public int getValue() {
    if(this.number == 11){
      this.number = 10;
    }
    else if(this.number == 12){
      this.number = 10;
    }
    else if(this.number == 13){
      this.number = 10;
    }
      return this.number;
    }
  }

