package cardBase;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LiQuid
 */
public abstract class HandOfCards implements Comparable {
    private ArrayList hand;

    /**
     *
     * @param card
     */
    public void addCard(Card card) { // Adds a card to the hand.
        hand.add(card);
    }
    
    /**
     *
     * @param cardNumber
     * @return
     */
    public Card getCard(int cardNumber) { // Get a card from the hand according to cardNumber.
        return (Card) hand.get(cardNumber);
    }
    
    /**
     *
     * @param cardNumber
     * @return
     */
    public Card removeCard( int cardNumber) { // Remove card from hand according to cardNumber.
        return (Card) hand.remove(cardNumber);
    }
    
    /**
     *
     * @param card
     * @return
     */
    public Card removeCard( Card card ) { // Remove card from hand according to the cards' index.
        int cardNumber = hand.indexOf(card);
        if ( cardNumber < 0 )
          return null;
        else
          return (Card) hand.remove(cardNumber);     
    }
    
    /**
     *
     */
    public void emptyHand() { // Remove all cards from hand.
      hand.clear();
    }
    
    /**
     *
     * @return
     */
    public int getHandSize() { // Get amount of cards in hand.
        return hand.size();
    }
    
    /**
     *
     * @return
     */
    public boolean hasCards() { // Check if hand has cards in it.
        return hand.isEmpty();
    }
    
    /**
     *
     */
    public void sort() { // Sort card in hand.
        Collections.sort(hand);
    }
    
    /**
     *
     * @param card
     * @return
     */
    public boolean containsCard(Card card) {
        return false;
    }
     
    /**
     *
     * @param card
     * @return
     */
    public int findCard(Card card) { // Checks to see if card is in hand and if it is, returns its' index.
        return hand.indexOf(card);
    }
    
    /**
     *
     * @param oldCard
     * @param newCard
     * @return
     */
    public boolean replaceCard(Card oldCard, Card newCard) { // Replaces oldCard with newCard from the hand.
        int loc = findCard(oldCard); //Checks if hand contains wanted oldCard.
        if (loc < 0)
           return false;            //If doesn't find, returns false.
        hand.set(loc, newCard);
        return true;                // If found, replaces card and returns true.
    }
    
    @Override
    public int compareTo(Object otherHandObj) {
      HandOfCards otherHand = (HandOfCards) otherHandObj;
      return evaluateHand() - otherHand.evaluateHand();
    }
    
    /**
     *
     * @return
     */
    public abstract int evaluateHand();
    
    public String toString() { // Prints out cards in hand.
        return hand.toString();
    }
     
}