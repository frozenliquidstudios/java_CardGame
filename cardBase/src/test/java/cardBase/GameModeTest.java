package cardBase;

import cardBase.Card;
import cardBase.GameMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameModeTest {
    
    private GameMode mode = new GameMode();
    
    public GameModeTest() {      
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
    public void eiValittuMode() {
        mode.setGameMode("");
        assertTrue(mode.getGameMode() == "");
    }
    
    @Test 
    public void ValittuMode() { 
        mode.setGameMode("Poker");
        assertTrue(mode.getGameMode() != "");
    }
    
}
