package cardBase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardSuitTest {
    
    private CardDeck deck = new CardDeck();
    
    public CardSuitTest() {
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
    public void cardHasSuit() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardSuit().getSuit().toString() != null);
    }
    
    @Test
    public void cardHasSuitAcronym() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardSuit().getSuitAcronym().toString() != null);
    }
}
