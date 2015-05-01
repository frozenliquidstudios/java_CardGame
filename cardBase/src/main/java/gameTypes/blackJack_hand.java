package gameTypes;

import cardBase.Card;
import cardBase.CardValue;
import cardBase.HandOfCards;

public class blackJack_hand extends HandOfCards {
    
    /**
     * An empty hand, filled within the games own rules accordingly.
     */
    public blackJack_hand() {      
    }
    
    /**
     * @return Evaluates value of hand.
     */
    @Override
    public int evaluateHand() {
        int value = 0;
        for (int i = 0; i < getHandSize(); i++) {
            Card card = getCard(i);
            int thisValue = card.getCardValue().compareTo( CardValue.ACE ) + 1;
            if ( thisValue > 10 )
               thisValue = 10;
            if ( thisValue == 14 )
               thisValue = 11;
            value += thisValue;
        }        
        return value;
    }    
}
