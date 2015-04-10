package cardBase;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LiQuid
 */
public class CardTest {
    
    private CardDeck deck = new CardDeck();
    
    public CardTest() {
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
        assertTrue(card.getCardSuit().toString() != null);
    }
    @Test
    public void cardHasValue() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardValue().toString() != null);
    }
    @Test
    public void cardHasImage() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getImageFilename(card.getCardSuit(), card.getCardValue()).contains(".png"));
    }
    @Test
    public void imageExists() {
        deck.fillDeck();  
        Card card = deck.dealCard();  
        File file = new File("src/main/java/cardImages/c2.png");
        assertTrue(file.exists());
    }
    @Test
    public void cardHasIntValue() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.getCardIntValue() == (int)card.getCardIntValue());
    }
    @Test
    public void suitPrintingWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.suitToString().getClass().equals(String.class));
    }
    @Test
    public void valuePrintingWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.valueToString().getClass().equals(String.class));
    }
    @Test
    public void namePrintingWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.toString().getClass().equals(String.class));
    }
    @Test
    public void comparisonWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.sameAs(card));
    }
    
}
