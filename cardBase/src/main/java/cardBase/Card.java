package cardBase;

public class Card implements Comparable {
    private CardSuit suit;
    private CardValue value;
    private static boolean sortByValue = true;
    
    public Card (CardSuit card_suit, CardValue card_value) {
        suit = card_suit;
        value = card_value;
    }
    
    public CardSuit getCardSuit() { // return card suit
        return suit;
    }
      
    public CardValue getCardValue() { //return card value
        return value;
    }
    
    public String suitToString() {  //print card suit
        return suit.toString();
    }
    
    public String valueToString() { //print card value
        return value.toString();
    }
    
    public String toString() {      //print card suit and value
        return value.toString() + " of " + suit.toString();
   }
    
    public static void sortCardsBySuit() { //card sorting aid for deck and shuffle
            sortByValue = false;
    }
    
    public static void sortCardsByValue() { //card sorting aid for deck and shuffle
            sortByValue = true;
    }
    
    public boolean sameAs( Card card ) { //compares suit and value to another card object.
      if ( ( value != card.value ) || ( suit != card.suit ) )
         return false;
      else
         return true;
   }

    public int compareTo(Object otherCardObj) { //another comparison used only for sorting cards and creating a deck.
        Card otherCard = (Card) otherCardObj;
        int value_difference =  value.compareTo(otherCard.value);
        int suit_difference =   suit.compareTo(otherCard.suit);
        
        if ( sortByValue ) {
         if ( value_difference != 0 )
            return value_difference;
         else
            return suit_difference;
      }
      else {
         if ( suit_difference != 0 )
            return suit_difference;
         else
            return value_difference;
      }
    }
}