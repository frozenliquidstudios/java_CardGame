package cardBase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardValueTest {
    
    private CardDeck deck = new CardDeck();
    
    public CardValueTest() {
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
    public void cardHasValue() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardValue().getValue().toString() != null);
    }
    
    @Test
    public void cardHasSuitAcronym() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardValue().getValueAcronym().toString() != null);
    }
    
    @Test
    public void cardHasSuitAcronymIntCheck() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardValue().getCardInt() > 0);
    }
}
