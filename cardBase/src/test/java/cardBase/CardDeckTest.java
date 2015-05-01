package cardBase;

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
    @Test 
    public void deckShufflesProperly() {
        CardDeck firstDeck = new CardDeck();
        firstDeck.fillDeck();   // not shuffled
        Card card1 = firstDeck.dealCard();
        Card card2 = firstDeck.dealCard();
        Card card3 = firstDeck.dealCard();
        Card card4 = firstDeck.dealCard();
        Card card5 = firstDeck.dealCard();
        
        CardDeck secondDeck = new CardDeck();
        secondDeck.fillDeck();
        secondDeck.shuffleDeck();   // shuffled
        Card card01 = secondDeck.dealCard();
        Card card02 = secondDeck.dealCard();
        Card card03 = secondDeck.dealCard();
        Card card04 = secondDeck.dealCard();
        Card card05 = secondDeck.dealCard();
        
        assertTrue(card1 != card01 || card2 != card02 || card3 != card03 || card4 != card04 || card5 != card05);
    }
    @Test 
    public void resetDeckGoesToZero() {
        deck.fillDeck();
        Card card = deck.dealCard();
        card = deck.dealCard();
        assertTrue(deck.getAmountOfCardsInPlay() > 0);
        deck.resetDeck();
        assertTrue(deck.getAmountOfCardsInPlay() == 0);
    }    
}
