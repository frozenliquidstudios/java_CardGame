package gameTypes;

import cardBase.*;

public class highLow {
 
      private int gamesPlayed = 0;     
      private int sumOfScores = 0;
      
      private int correctGuesses = 0;
      
      private CardDeck deck;
             
      private Card currentCard;
      private Card nextCard;
      
      private Boolean gameOver = false;
    
    /**
     * Initializes the game
     */
    public highLow() {
        deck = new CardDeck();
        deck.fillDeck();
        deck.shuffleDeck();
        currentCard = deck.dealCard();
        nextCard = deck.dealCard();
        correctGuesses = 0;
        gameOver = false;
    }
  
    /**
     *
     * @return current card
     */
    public Card getCurrentCard() {
        return currentCard;
    }
    
    /**
     *
     * @return next card
     */
    public Card getNextCard() {
        return nextCard;
    }
    
    /**
     *
     * @return current score
     */
    public int getCurrentScore() {
        return correctGuesses;
    }
    
    /**
     *
     * @return check if game is over
     */
    public boolean getGameOver() {
        return gameOver;
    }
    
    /**
     * Guesses next card is higher than current card.
     * @return If correct, add 1 to correctGuesses and return 1.
     * @return If wrong, set game over and return 0.
     */
    public int chooseHigh() {
       if(gameOver == true) {
                return 0;
            }
        
        else {
        currentCard = nextCard;
        nextCard = deck.dealCard();
        
            if(nextCard.getCardIntValue() > currentCard.getCardIntValue()) {
                    correctGuesses++;
                    return 1;
                }
           

            else {
                gameOver = true;
                return 0;
            }
        }
    }   
    
    /**
     * Guesses next card is lower than current card.
     * @return If correct, add 1 to correctGuesses and return 1.
     * @return If wrong, set game over and return 0.
     */
    public int chooseLow() {
       if(gameOver == true) {
                return 0;
            }
        
        else {
        currentCard = nextCard;
        nextCard = deck.dealCard();
        
            if(nextCard.getCardIntValue() < currentCard.getCardIntValue()) {
                    correctGuesses++;
                    return 1;
                }
           

            else {
                gameOver = true;
                return 0;
            }
        }
    }
}


    
