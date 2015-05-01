package cardBase;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HandOfCardsTest {
    
    CardDeck deck = new CardDeck();
    private HandOfCards hand = new HandOfCards() {

        @Override
        public int evaluateHand() {
            return 0;    // No need for testing     
        }
    };
    
    public HandOfCardsTest() {
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
    public void addCardAddsCard() { //#bestTestName2015
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getHandSize() == 1);
    }
    @Test
    public void getArrayOfHand() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getCards() instanceof ArrayList && hand.getHandSize() != 0);
    }
    @Test
    public void getCardFromHand() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getCard(0) instanceof Card);
    }
    @Test
    public void removeCardFromHandWithInt() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getHandSize() > 0);
        hand.removeCard(0);
        assertTrue(hand.getHandSize() == 0);
    }
    @Test
    public void removeCardFromHandWithCard() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getHandSize() > 0);
        hand.removeCard(card);
        assertTrue(hand.getHandSize() == 0);
    }
    @Test
    public void emptyWholeHand() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getHandSize() > 1);
        hand.emptyHand();
        assertTrue(hand.getHandSize() == 0);
    }
    @Test
    public void getHandSize() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.getHandSize() == 2);
    }  
    @Test
    public void cardIsFound() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.findCard(card) == 1);
    }
    @Test
    public void replaceCard() {
        deck.fillDeck();
        Card card1 = deck.dealCard();
        hand.addCard(card1);
        Card card2 = deck.dealCard();
        hand.replaceCard(card1, card2);
        assertTrue(hand.getCard(0) == card2);
    }
    @Test
    public void handHasCards() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.hasCards());
    }
    @Test
    public void PrintingWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand.toString() instanceof String);
    }
}
