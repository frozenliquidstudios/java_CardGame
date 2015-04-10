package gameTypes;

import GUI.game_highLow;
import cardBase.*;

/**
 *
 * @author LiQuid
 */
public class highLow extends game_highLow {
 
      private int gamesPlayed = 0;     
      private int sumOfScores = 0;
      
      private static String currentGuess;
      private static String correctGuess;
      private static int    correctGuesses = 0;
      
      private static Card currentCard;
      private static Card nextCard;
      
//      private double averageScore = sumOfScores / gamesPlayed;
      private static Boolean gameOver = false;

    /**
     *
     * @return
     */
    public static int playHighLow() {
   
        CardDeck deck = new CardDeck();
        deck.fillDeck();
        deck.shuffleDeck();
      
        currentCard = deck.dealCard();
        nextCard = deck.dealCard();
     
    while(gameOver == false) {
           
        if(nextCard.getCardValue() == currentCard.getCardValue()) {
            gameOver = true;
        }
        else if(nextCard.getCardIntValue() > currentCard.getCardIntValue()) {
            if (currentGuess == "high") {
                correctGuesses++;
            }
            else {
                gameOver = true;
            }
        }
        else {
            if (currentGuess == "low") {
                correctGuesses++;
            }
            else {
                gameOver = true;
            }
        }
         
         currentCard = nextCard;
         nextCard = deck.dealCard();
         gameOver = true;
      }
      return correctGuesses;
   }
    
    /**
     *
     * @return
     */
    public static Card getCurrentCard() {
        return currentCard;
    }
    
    /**
     *
     * @return
     */
    public static Card getNextCard() {
        return nextCard;
    }
    
    /**
     *
     */
    public static void chooseHigh() {
        currentGuess = "high";
    }
    
    /**
     *
     */
    public static void chooseLow() {
        currentGuess = "low";
    }
}