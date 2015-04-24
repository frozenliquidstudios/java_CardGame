package gameTypes;

import cardBase.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class highLow {
      
      private int correctGuesses;      
      private CardDeck deck;             
      private Card currentCard;
      private Card nextCard;      
      private Boolean gameOver;
      private ArrayList finalScores = new ArrayList();
      
    
    /**
     * Initializes the game
     */
    public highLow() {
        deck = new CardDeck();
        deck.fillDeck();
        deck.shuffleDeck();
        correctGuesses = 0;
        gameOver = false;
        currentCard = deck.dealCard();
        nextCard = null;
    }
    
    public Card getCurrentCard() {
        return currentCard;
    }
    
    public Card getNextCard() {
        return nextCard;
    }

    public int getCurrentScore() {
        return correctGuesses;
    }
    
    /**
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
    public boolean chooseHigh() {   
            
            nextCard = deck.dealCard();
            
            if(nextCard.getCardIntValue() > currentCard.getCardIntValue()) {
                    correctGuesses++;
                    gameOver = false;
            }
            else {
                gameOver = true;
            }
        currentCard = nextCard;
        return gameOver;
    }  
    
    /**
     * Guesses next card is lower than current card.
     * @return If correct, add 1 to correctGuesses and return 1.
     * @return If wrong, set game over and return 0.
     */
    public boolean chooseLow() {
        
           nextCard = deck.dealCard();
            
            if(nextCard.getCardIntValue() < currentCard.getCardIntValue()) {
                    correctGuesses++;
                    gameOver = false;
            }
            else {
                gameOver = true;
            }
        currentCard = nextCard;
        return gameOver;
    }  
    
}


    
