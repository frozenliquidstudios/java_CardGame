package cardBase;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.JApplet;

public class CardDeck extends JApplet{
    
    private ArrayList deck;
    private final String imageLocation = "/cardImages/";   
    private int cardCount; // Amount of cards in play.
    
    /**
     * Create an empty deck.
     */
    public CardDeck() {
        deck = new ArrayList();
        cardCount = 0;
    }
    
    /**
     * @param card Add card to the deck.
     */
    public void addCard(Card card) { 
        deck.add(card);
    }
    
    /**
     * @return If deck has no cards left, return null,
     *         else get a card and increase cardCount.
     */
    public Card dealCard() {  // Deal a single card.
      if(cardCount >= deck.size())  
         return null;              
      else                           
         return (Card)deck.get(cardCount++);
    }

    public int getDeckSize() {
        return deck.size();
    }
    
    public int getRemainingCards() { 
        return deck.size() - cardCount;
    }
    
    /**
     * @return Check if deck still contains cards.
     */
    public boolean hasCards() { 
        if(cardCount < deck.size()) 
            return true;
        else 
            return false;
    }
    
    /**
     * Fill deck with 52 cards, all unique.
     */
    public void fillDeck() {
        Iterator suitIterator = CardSuit.VALUES.iterator();                 // Iterates through all suits.
		while(suitIterator.hasNext()) {                             // Checks if more suits to cycle through.
		    CardSuit suit = (CardSuit) suitIterator.next();         // Adds the suit to the card.
		    Iterator valueIterator = CardValue.VALUES.iterator();   // Initializes value iterator.
                    
		while(valueIterator.hasNext()) {                                            // Checks if more values to cycle through.
		    CardValue value = (CardValue) valueIterator.next();                     // Adds the value to the card.
                    String imageFile = imageLocation + Card.getImageFilename(suit, value);  // Stores image filename.
                    BufferedImage img = null;                                               // Initializes image as null.
                        try {
                            img = ImageIO.read(getClass().getResourceAsStream(imageFile));      // Places proper image path to img variable
                        } catch (IOException e) {
                            e.printStackTrace(); // Traces any errors
                        }
                    Card card = new Card(suit, value, img); // Creates the card and places suit, value and image file to it.
		    addCard(card); // Adds card to deck.                     
                } 
            } 
    }
             
    /**
     * Shuffle the cards in the deck.
     */
    public void shuffleDeck() { 
        Collections.shuffle(deck);
    }

    /**
     * Resets card count of deck to 0.
     */
    public void resetDeck() {
        cardCount = 0;
    }
    
    public int getAmountOfCardsInPlay() {
        return cardCount;
    }
}