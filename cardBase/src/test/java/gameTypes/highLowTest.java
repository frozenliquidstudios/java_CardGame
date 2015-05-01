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
    public void getCurrentCard() {
        assertTrue(game.getCurrentCard() instanceof Card);
    }
    @Test
    public void getNextCard() {
        assertTrue(game.getNextCard() == null);
    }
    @Test
    public void getCurrentScore() {
        assertTrue(game.getCurrentScore() == 0);
    }
    @Test
    public void getGameOver() {
        assertTrue(game.getGameOver() == false);
    }
    @Test
    public void gameContinuesOnHigh() {
        boolean result = game.chooseHigh();
            if(result == true) {
                assertTrue(game.getGameOver() == true);
            } else {
                assertTrue(game.getGameOver() == false);
                assertTrue(game.getCurrentScore() == 1); 
            }
    }
    @Test
    public void gameContinuesOnLow() {
        boolean result = game.chooseLow();
            if(result == true) {
                assertTrue(game.getGameOver() == true);
            } else {
                assertTrue(game.getGameOver() == false);
                assertTrue(game.getCurrentScore() == 1);
            }
    }    
}
