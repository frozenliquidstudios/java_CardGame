package highScores;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HighScoreManagerTest {
    
    HighScoreManager hs = new HighScoreManager();
    
    public HighScoreManagerTest() {
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
    public void succesfullyGetScores() {      
        assertTrue(hs.getScores().size() > 0);
    }
    
    @Test
    public void succesfullyAddScores() {
        int size1 = hs.getScores().size();
        hs.addScore("testScore", 1);
        int size2 = hs.getScores().size();
        assertTrue(size1 < size2);
    }
    @Test
    public void getTop5asString() {       
        assertTrue(hs.getHighscoreString().length() > 10);
    }
    @Test
    public void get1ScoreAsString() {       
        assertTrue(hs.getHighscoreString(1).length() > 10);
    } 
    @Test
    public void isAhighscore() {       
        assertTrue(hs.isHighScore(100));
        assertTrue(!hs.isHighScore(0));
    }
}
