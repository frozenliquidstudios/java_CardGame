package cardBase;

import java.util.Arrays;
import java.util.Collections;

public final class CardSuit implements Comparable {
    private String name;
    private String symbol;
    
    private CardSuit( String suit_name, String suit_symbol ) {
      name = suit_name;     // full name of suit
      symbol = suit_symbol; // an acronym for name of suit
   }
    
    // All card suits
    public final static CardSuit SPADES   = new CardSuit("Spades", "s");
    public final static CardSuit CLUBS    = new CardSuit("Clubs", "c");
    public final static CardSuit DIAMONDS = new CardSuit("Diamonds", "d");
    public final static CardSuit HEARTS   = new CardSuit("Hearts", "h");

    public String getSuit() {
       return name;
    }
    
    public String getSuitSymbol() {
        return symbol;
    }
    
    @Override
    public String toString() {
      return name;
   }
    
    // All suits in a list for comparison.
    public final static java.util.List VALUES = 
        Collections.unmodifiableList(Arrays.asList( new CardSuit[] { SPADES, CLUBS, DIAMONDS, HEARTS }));
   
    @Override
    public int compareTo(Object otherSuitObj) {
      CardSuit otherSuit = (CardSuit) otherSuitObj;
      return VALUES.indexOf( this ) - VALUES.indexOf( otherSuit );
    }
}