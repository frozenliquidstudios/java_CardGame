package cardBase;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LiQuid
 */
public abstract class HandOfCards implements Comparable {
    private ArrayList hand;
    
    public HandOfCards() {
        hand = new ArrayList();
    }
    
    /**
     * Adds a card to the hand.
     * @param card card to be added
     */
    public void addCard(Card card) { 
        hand.add(card);
    }
    
    public ArrayList getCards() {
        return hand;
    }
    
    /**
     * @param cardNumber Get a card from the hand according to cardNumber.
     * @return the requested card
     */
    public Card getCard(int cardNumber) {
        return (Card) hand.get(cardNumber);
    }
    
    /**
     *
     * @param cardNumber Remove card from hand according to cardNumber.
     * @return the requested card
     */
    public Card removeCard( int cardNumber) {
        return (Card) hand.remove(cardNumber);
    }
    
    /**
     *
     * @param card Remove card from hand according to the cards index, if proper number is given.
     * @return the requested card
     */
    public Card removeCard( Card card ) { 
        int cardNumber = hand.indexOf(card);
        if ( cardNumber < 0 )
          return null;
        else
          return (Card) hand.remove(cardNumber);     
    }
    
    /**
     *  Remove all cards from hand.
     */
    public void emptyHand() {
      hand.clear();
    }
    
    /**
     *
     * @return Get amount of cards in hand.
     */
    public int getHandSize() {
        return hand.size();
    }
    
    /**
     *
     * @return Check if hand has cards in it.
     */
    public boolean hasCards() { 
        return hand.isEmpty();
    }
    
    /**
     * Sort cards in hand.
     */
    public void sort() { 
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
     * @param card Checks to see if card is in hand and if it is, returns its index.
     * @return
     */
    public int findCard(Card card) {
        return hand.indexOf(card);
    }
    
    /**
     *
     * @param oldCard   Checks if hand contains wanted oldCard.
     *                  If doesn't find, returns false.
     * @param newCard
     * @return If new card is found, replaces card and returns true.
     */
    public boolean replaceCard(Card oldCard, Card newCard) {
        int location = findCard(oldCard); 
        if (location < 0)
           return false;            
        hand.set(location, newCard);
        return true;                 
    }
    
    @Override
    public int compareTo(Object otherHandObj) {
      HandOfCards otherHand = (HandOfCards) otherHandObj;
      return evaluateHand() - otherHand.evaluateHand();
    }
    
    /**
     *
     * @return Prints out cards in hand.
     */
    public abstract int evaluateHand();
    
    public String toString() { 
        return hand.toString();
    }
     
}