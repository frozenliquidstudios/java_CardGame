package cardBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CardDeck {
    
    private ArrayList<Card> deck;
    public int cardCount;
    
    public CardDeck() {
    
    this.deck = new ArrayList<Card>();
    
    for (int i=0; i<13; i++) { //Asettaa pakkaan 52 korttia, jokainen eri kortti.
        
        CardValue value = CardValue.values()[i];
        
        for (int x=0; x<4; x++) { // 13 korttia * 4 maata.
            Card card = new Card(value, CardSuit.values()[x]);
            this.deck.add(card);
            this.cardCount++;
        }
    }
    
    Collections.shuffle(deck);  //Sekoittaa kaikki kortit satunnaiseen järjestykseen.
    
    Iterator<Card> cardIterator = deck.iterator();
    
    while (cardIterator.hasNext()) {
            Card card = cardIterator.next();
     //     System.out.println(card.getCardValue() + " of " + card.getCardSuit()); // Prinnttaa kaikki kortit.
        }
    }
    
    public int getDeckSize() {
        return this.cardCount;
    }
}
