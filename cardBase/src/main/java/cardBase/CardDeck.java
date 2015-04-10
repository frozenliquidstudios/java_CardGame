package cardBase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class CardDeck extends JApplet{
    
    private ArrayList deck;
    private final String imageLocation = "src/main/java/cardImages/";
    private int cardCount; // Amount of cards in play.
    
    public CardDeck() { // Create an empty deck.
        deck = new ArrayList();
        cardCount = 0;
    }
    
    public void addCard(Card card) { // Add a card to the deck.
        deck.add(card);
    }
    
    public Card dealCard() {        // Deal a single card.
      if(cardCount >= deck.size()) // If deck has no cards left, return null
         return null;             // else get a card and increase cardCount.
      else                           
         return (Card)deck.get(cardCount++);
    }
    
    public int getDeckSize() {  // Get size of full deck.
        return deck.size();
    }
    
    public int getRemainingCards() { // Get amount of cards left in the deck.
        return deck.size() - cardCount;
    }
    
    public boolean hasCards() { // Check if deck still contains cards.
        if(cardCount >= deck.size()) 
            return true;
        else 
            return false;
    }    
    
    public void fillDeck() {
        Iterator suitIterator = CardSuit.VALUES.iterator();
		while(suitIterator.hasNext()) {
		    CardSuit suit = (CardSuit) suitIterator.next();
		    Iterator rankIterator = CardValue.VALUES.iterator();
                    
		while(rankIterator.hasNext()) {
		    CardValue value = (CardValue) rankIterator.next();	
                    String imageFile = imageLocation + Card.getImageFilename(suit, value);         
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new File(imageFile));
                    }
                    catch (IOException e) {
                        e.printStackTrace();  
                    }   
		    Card card = new Card(suit, value, img);
		    addCard(card);
		}
            }
    }
    
    public void shuffleDeck() { // Shuffle the cards in the deck.
        Collections.shuffle(deck);
    }

    public void resetDeck() {
        cardCount = 0;
    }  
}