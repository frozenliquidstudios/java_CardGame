package gameTypes;

import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class blackJackTest {
    
    blackJack game = new blackJack();
    
    public blackJackTest() {
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
    public void gameDealsFresh2CardHands() {
        game.dealNewHands();
        assertTrue(game.getMyHandSize() == 2);
        assertTrue(game.getDealerHandSize() == 2);
    }
    @Test
    public void dealPlayerOneCard() {
        game.dealNewHands();
        game.dealPlayerOneCard();
        assertTrue(game.getMyHandSize() == 3);
    }
    @Test
    public void dealDealerOneCard() {
        game.dealNewHands();
        game.dealDealerOneCard();
        assertTrue(game.getDealerHandSize() == 3);
    }
    @Test
    public void getMyHandSize() {
        game.dealNewHands();
        assertTrue(game.getMyHandSize() == 2);
    }
    @Test
    public void getDealerHandSize() {
        game.dealNewHands();
        assertTrue(game.getDealerHandSize() == 2);
    }    
    @Test
    public void setAndGetMyHandValue() {
        game.dealNewHands();
        int mvalue1 = game.getMyHandValue();
        int dvalue1 = game.getDealerHandValue();
        game.dealPlayerOneCard();
        game.dealDealerOneCard();
        int mvalue2 = game.getMyHandValue();
        int dvalue2 = game.getDealerHandValue();
        assertTrue(mvalue2 != (int)mvalue1);
        assertTrue((int)dvalue2 != (int)dvalue1);
    }
    @Test
    public void getDealerFirstCardValue() {
        game.dealNewHands();
        assertTrue(game.getDealerFirstCardValue() > 0 &&
                   game.getDealerFirstCardValue() < 11);       
    }
    @Test
    public void getScores() {
        game.dealNewHands();
        assertTrue(game.getMyScore() == 0);
        assertTrue(game.getDealerScore() == 0);  
    }    
    @Test
    public void addScores() {
        game.dealNewHands();
        game.addMyScore();
        game.addMyScore();
        game.addMyScore();
        game.addDealerScore();
        game.addDealerScore();
        assertTrue(game.getMyScore() == 3);
        assertTrue(game.getDealerScore() == 2);  
    }    
    @Test
    public void checkIfOneHas21() {
        game.dealNewHands();
        int mvalue = game.getMyHandValue();
        int dvalue = game.getDealerHandValue();
        game.checkFor21();
            if(mvalue == 21 || dvalue == 21) {
                assertTrue(game.isOver() == true);
                assertTrue(game.getMyScore() > 0 || game.getDealerScore() > 0);              
            } else {
                assertTrue(game.isOver() == false);
            }
    }
    @Test
    public void isGameOver() {
        game.dealNewHands();
        assertTrue(game.isOver() == false); 
    } 
    @Test
    public void getImagesProperly() {
        game.dealNewHands();
        assertTrue(game.getCardImages("myCard1") instanceof BufferedImage); 
    } 
}
