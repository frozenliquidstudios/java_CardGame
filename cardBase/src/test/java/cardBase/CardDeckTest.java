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
    public void tyhjaPakka() {
        assertTrue(deck.getDeckSize() == 0);
    }
    
    @Test 
    public void taysiPakka() {
        deck.fillDeck();
        assertTrue(deck.getDeckSize() == 52);
    } 
}
