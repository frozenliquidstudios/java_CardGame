package cardBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CardDeck {
    
    private ArrayList<Card> deck;
    
    public CardDeck() {
    
    this.deck = new ArrayList<Card>();
    for (int i=0; i<13; i++) {
        
        CardValue value = CardValue.values()[i];
        
        for (int x=0; x<4; x++) {
            Card card = new Card(value, CardSuit.values()[x]);
        //    Card card = new Card(value, Suit.values()[j]);
            this.deck.add(card);
        }
    }
    
    Collections.shuffle(deck);
    
    Iterator<Card> cardIterator = deck.iterator();
    
    while (cardIterator.hasNext()) {
        Card card = cardIterator.next();
        System.out.println(card.getCardValue() + " of " + card.getCardSuit());
        }
    }   
}
