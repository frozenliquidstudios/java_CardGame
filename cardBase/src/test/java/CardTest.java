import cardBase.Card;
import cardBase.CardDeck;
import cardBase.CardSuit;
import cardBase.CardValue;
import cardBase.GameMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    private CardDeck deck = new CardDeck();
    private GameMode mode = new GameMode();
    private Card card = new Card(CardValue.values()[1], CardSuit.values()[1]);
    
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
    public void cardSuitTest() {
        assertTrue(card.getCardSuit() == CardSuit.values()[1]);
    }
    
    public void cardValueTest() {
        assertTrue(card.getCardValue() == CardValue.values()[1]);
    }
    
    @Test 
    public void cardCount() {
        assertTrue(this.deck.getDeckSize() == 52);   
    }
    
    @Test
    public void gameModeChosen() {
        mode.setGameMode("Poker");
        assertTrue(this.mode.getGameMode() == "Poker");          
    }
    
    
    
    
}
