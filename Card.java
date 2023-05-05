/*
 * Shuffle Deck Class
 * A class which represents a single playing card, Card. 
 * Use this class to test the methods in your Deck and Main classes. DO NOT EDIT!
 */

public class Card {

 /**
  * String value that holds the suit of the card
  */
 private String suit;

 /**
  * String value that holds the rank of the card
  */
 private String rank;

 /**
  * int value that holds the point value.
  */
 private int pointValue;


 /**
  * Creates a new "Card" instance.
  *
  * @param cardRank  a "String" value containing the rank of the card
  * @param cardSuit  a "String" value containing the suit of the card
  * @param cardPointValue an "int" value containing the point value of the card
  */
 public Card(String cardRank, String cardSuit, int cardPointValue) {
  //initializes a new Card with the given rank, suit, and point value
  rank = cardRank;
  suit = cardSuit;
  pointValue = cardPointValue;
  
 }


 /**
  * Accesses this "Card's" suit.
  * @return this "Card's" suit.
  */
 public String getSuit() {
  return suit;
 }

 /**
  * Accesses this "Card's" rank.
  * @return this "Card's" rank.
  */
 public String getRank() {
  return rank;
 }

   /**
  * Accesses this "Card's" point value.
  * @return this "Card's" point value.
  */
 public int getPointValue() {
  return pointValue;
 }

 /** Compare this card with the argument.
  * @param otherCard the other card to compare to this
  * @return true if the rank, suit, and point value of this card are equal to those of the argument;
  *         false otherwise.
  */
 public boolean matches(Card otherCard) {
  return otherCard.getSuit().equals(this.getSuit())
   && otherCard.getRank().equals(this.getRank())
   && otherCard.getPointValue() == this.getPointValue();
 }

 /**
  * Converts the rank, suit, and point value into a string in the format
  *     "[Rank] of [Suit] (point value = [PointValue])".
  * This provides a useful way of printing the contents
  * of a "Deck" in an easily readable format or performing
  * other similar functions.
  *
  * @return a "String" containing the rank, suit and point value of the card.
  */
 @Override
 public String toString() {
  return rank + " of " + suit + " (point value = " + pointValue + ")";
    
 }
}
