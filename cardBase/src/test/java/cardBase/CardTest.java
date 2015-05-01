package cardBase;

import java.awt.image.BufferedImage;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        assertTrue(!card.getImageFilename(card.getCardSuit(), card.getCardValue()).isEmpty());
    }
    @Test
    public void returnsAnImage() {
        deck.fillDeck();  
        Card card = deck.dealCard();  
        assertTrue(card.getCardImage() instanceof BufferedImage);
    }
    
    @Test
    public void cardBackSideImageExists() {
        deck.fillDeck();  
        Card card = deck.dealCard();  
        assertTrue(card.getCardBackImage().equals("back.png"));
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
        Card card2 = deck.dealCard();
        assertTrue(!card.sameAs(card2));
    }
    @Test
    public void compareToWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        Card card2 = deck.dealCard();
        card.sortCardsByValue();
        card2.sortCardsByValue();
            if(card.getCardValue() != card2.getCardValue()) {              
                assertTrue(card.compareTo(card2) == (card.getCardIntValue() - card2.getCardIntValue()) || 
                           card.compareTo(card2) == (card2.getCardIntValue() - card.getCardIntValue()));
            }                  
    }
    
    @Test
    public void sortingTypeWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        card.sortCardsBySuit();
        assertTrue(!card.getSortType());
        card.sortCardsByValue();
        assertTrue(card.getSortType());
    }
    @Test
    public void IntPlusStringPrintWorks() {
        deck.fillDeck();
        Card card = deck.dealCard();
        assertTrue(card.toStringWithIntegers().equals((int)card.getCardIntValue() + " of " + card.suitToString()));
    }
    
}
