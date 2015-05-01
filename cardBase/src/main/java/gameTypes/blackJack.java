package gameTypes;

import cardBase.Card;
import cardBase.CardDeck;
import cardBase.HandOfCards;
import java.awt.image.BufferedImage;

public class blackJack {
    
    private CardDeck    deck;   
    private Card        card;    
    private HandOfCards myHand, dealerHand;     
    private int         myHandValue, dealerHandValue, myScore, dealerScore, winningScore, aceCounter;
    private boolean     gameOver = false;
    
    private BufferedImage myCard1, myCard2, dealerCard1, dealerCard2;
    
    /**
     * Initializes game variables.
     */
    public blackJack() {
        myHandValue     = 0;
        myScore         = 0;
        dealerHandValue = 0;
        dealerScore     = 0;
        winningScore    = 5;    //Amount of round wins needed to win a full game.
        gameOver        = false;
    }
    
    /**
     * Deal 2 cards to both players and set the combined value to variables.
     */
    public void dealNewHands() {
        deck = new CardDeck();
        deck.fillDeck();
        deck.shuffleDeck();
        
        myHand      = new blackJack_hand();
	dealerHand  = new blackJack_hand();
        
	for (int i=0; i < 2; i++) {
            card = deck.dealCard();
            myHand.addCard(card);
            
            card = deck.dealCard();
            dealerHand.addCard(card);
        }
        
        myHandValue = 0;
        dealerHandValue = 0;
        
        setMyHandValue();
        setDealerHandValue();
    }
    
    /**
     * Deal player a card, used if player doesn't want to stay with initial 2 cards. Sets new hand value to variable.
     */
    public void dealPlayerOneCard() {
        card = deck.dealCard();
        myHand.addCard(card);
        setMyHandValue();
    }
    
    /**
     * Deal dealer a card, used if dealers hands value is less than 17. Sets new hand value to variable.
     */
    public void dealDealerOneCard() {
        card = deck.dealCard();
        dealerHand.addCard(card);
        setDealerHandValue();
    }
       
    /**
     * @return Amount of cards in players hand.
     */
    public int getMyHandSize() {
        return myHand.getHandSize();
    }
    
    /**
     * @return Amount of cards in dealers hand.
     */
    public int getDealerHandSize() {
        return dealerHand.getHandSize();
    }
    
    /**
     * Sets total value of players hand to variable.
     * If a cards value is over 10, it is still valued 10.
     * Ace can be valued at 1 or 11 depending on if total value of hand would go over 21 or not. Automatically changed accordingly.
     */
    public void setMyHandValue() {
        int value;
        int total = 0;
        
        for(int i=0; i < myHand.getHandSize(); i++) {
            value = myHand.getCard(i).getCardIntValue();
            
            if(value > 10) {
                if(value > 13) {
                    aceCounter++;
                } else {
                    total += 10;
                }
            } else {
                total += value;
            }
        }
        
        if(aceCounter > 0) {
            if(aceCounter == 1 && total < 11) {
                total += 11;
            } else {
                total += aceCounter*1;           
            }
        }
       aceCounter = 0;
       myHandValue = total;
    }
    
    /**
     * @return Gets total value of players cards.
     */
    public int getMyHandValue() {
        return myHandValue;
    }
    
    /**
     * @return Gets value of first card in dealers hand. Needed, since one card should be hidden to player before player Stays.
     */
    public int getDealerFirstCardValue() {
        if(dealerHand.getCard(0).getCardIntValue() > 10)
            return 10;
        else
            return dealerHand.getCard(0).getCardIntValue();
    }        
    
    /**
     * Sets total value of dealers hand to variable.
     * If a cards value is over 10, it is still valued 10.
     * Ace can be valued at 1 or 11 depending on if total value of hand would go over 21 or not. Automatically changed accordingly.
     */
    public void setDealerHandValue() {
        int value;
        int total = 0;
        
        for(int i=0; i < dealerHand.getHandSize(); i++) {
            value = dealerHand.getCard(i).getCardIntValue();
            
            if(value > 10) {
                if(value > 13) {
                    aceCounter++;
                } else {
                    total += 10;
                }
            } else {
                total += value;
            }
        }       
        if(aceCounter > 0) {
            if(aceCounter == 1 && total < 11) {
                total += 11;
            } else {
                total += aceCounter*1;           
            }
        }     
        aceCounter = 0;
        dealerHandValue = total;
    }
 
    /**
     * @return Gets total value of dealers cards.
     */
    public int getDealerHandValue() {
        return dealerHandValue;
    }
    
    /**
     * @return total score of player.
     */
    public int getMyScore() {
        return myScore;
    }
    
    /**
     * Adds one to players score.
     */
    public void addMyScore() {
        myScore++;
    }
            
    /**
     * Adds one to dealers score.
     */
    public void addDealerScore() {
        dealerScore++;
    }
    
    /**
     * @return total score of dealer.
     */
    public int getDealerScore() {
        return dealerScore;
    }
    
    /**
     * Checks if either players hand is valued at 21, which would result ending the round.
     */
    public void checkFor21() {
        if(myHandValue == 21) {
            gameOver = true;
            myScore++;
      } if(dealerHandValue == 21) {
            gameOver = true;
            dealerScore++;
        } else {
            gameOver = false;
        }
    }
    
    /**
     * @return Checks if game is over.
     */
    public boolean isOver() {
        return gameOver;
    }
    
    /**
     * @param card Card of which the image is wanted.
     * @return Image if the card in question.
     */
    public BufferedImage getCardImages(String card) {
               if(card == "myCard1") {
            return myHand.getCard(0).getCardImage();
        } else if(card == "myCard2") {
            return myHand.getCard(1).getCardImage();
        } else if(card == "myCard3") {
            return myHand.getCard(2).getCardImage();
        } else if(card == "myCard4") {
            return myHand.getCard(3).getCardImage();
        } else if(card == "myCard5") {
            return myHand.getCard(4).getCardImage();
        } else if(card == "dealerCard1") {
            return dealerHand.getCard(0).getCardImage();
        } else if(card == "dealerCard2") {
            return dealerHand.getCard(1).getCardImage();
        } else if(card == "dealerCard3") {
            return dealerHand.getCard(2).getCardImage();
        } else if(card == "dealerCard4") {
            return dealerHand.getCard(3).getCardImage();
        } else if(card == "dealerCard5") {
            return dealerHand.getCard(4).getCardImage();
        } else {
            return null;
        }       
    }  
}

    