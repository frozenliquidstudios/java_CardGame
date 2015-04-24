package gameTypes;

import cardBase.Card;
import cardBase.CardDeck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class highLowTest {
    
    private CardDeck deck = new CardDeck();
    private highLow game = new highLow();
    
    public highLowTest() {
        
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
    public void checkLow() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardValue().getValueAcronym().toString() != null);
    }
}
