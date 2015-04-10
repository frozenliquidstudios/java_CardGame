package cardBase;

import cardBase.Card;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardDeckTest {
    
    private CardDeck deck = new CardDeck();
    
    public CardDeckTest() {      
    }    
    @BeforeClass
    public static void setUpClass() {       
    }  
    @AfterClass
    public static void tearDownClass() {
    }  
    @Before
    public void setUp() {
    }   
    @After
    public void tearDown() {
    }
  
    @Test
    public void emptyDeck() {
        assertTrue(deck.getDeckSize() == 0);
    }   
    @Test 
    public void fullDeck() {
        deck.fillDeck();
        assertTrue(deck.getDeckSize() == 52);
    } 
    @Test 
    public void addAcard() {
        Card card = deck.dealCard();
        deck.addCard(card);
        assertTrue(deck.getDeckSize() == 1);
    }
    @Test 
    public void dealAcard() {
        Card card = deck.dealCard();
        deck.addCard(card);
        assertTrue(deck.getDeckSize() == 1);
    }
    @Test 
    public void cardsLeftinDeck() {
        deck.fillDeck();
        deck.dealCard();
        deck.dealCard();
        deck.dealCard();
        assertTrue(deck.getRemainingCards() == 49);
    }
    @Test 
    public void deckHasCardsLeftInIt() {
        Card card = deck.dealCard();
        deck.addCard(card);
        assertTrue(deck.hasCards() == true);
    }
    @Test 
    public void deckHasNoCardsLeftInIt() {
        Card card = deck.dealCard();
        deck.addCard(card);
        deck.dealCard();
        assertTrue(deck.hasCards() == false);
    }
}
