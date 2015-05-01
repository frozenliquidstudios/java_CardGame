package gameTypes;

import cardBase.Card;
import cardBase.CardDeck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class blackJack_handTest {
    
    CardDeck deck = new CardDeck();
    blackJack_hand hand = new blackJack_hand();
    
    public blackJack_handTest() {
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
    public void HandEvaluationTest() {
        deck.fillDeck();
        Card card = deck.dealCard();
        hand.addCard(card);
        card = deck.dealCard();
        hand.addCard(card);
        assertTrue(hand != null);
    }
}
