package cardBase;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card implements Comparable {
    private CardSuit  suit;
    private CardValue value;
    private BufferedImage image;
    private static boolean sortByValue = true;
    
    /**
     *
     * @param card_suit     Suit of the card (clubs, spades, diamonds, hearts) 
     * @param card_value    Value of the card (1-14)
     * @param card_image    Image file used in GUI
     */
    public Card (CardSuit card_suit, CardValue card_value, BufferedImage card_image) {
        suit  = card_suit;
        value = card_value;
        image = card_image;
    }
    
    /**
     *
     * @return The card's suit
     */
    public CardSuit getCardSuit() {
        return suit;
    }
      
    /**
     *
     * @return The card's value
     */
    public CardValue getCardValue() {
        return value;
    }
    
    /**
     *
     * @param suit  Card suit for filename
     * @param value Card value for filename
     * @return The specific filename located in cardImages folder 
     */
    public static String getImageFilename( CardSuit suit, CardValue value ) {
        return suit.getSuitAcronym() + value.getValueAcronym() + ".png";
    }
    
    /**
     *
     * @return Buffered image of a specific card to be used in GUI
     */
    public BufferedImage getCardImage() {
        return image;
    }
    
    /**
     *
     * @return get image representing back of the card
     */
    public BufferedImage getCardBackImage() {
        
        String imageFile = "src/main/java/cardImages/back.png";   // Stores image filename.
                    BufferedImage img = null; // Initializes image as null.
                    try {
                        img = ImageIO.read(new File(imageFile));    // Places proper image path to img variable
                    }
                    catch (IOException e) {
                        e.printStackTrace();  // Traces any errors
                    }
        return img;                   
    }
    
    /**
     *
     * @return Cards value in integer form for easier comparison
     */
    public int getCardIntValue() {
        return value.getCardInt();
    }
    
    /**
     *
     * @return prints suit name
     */
    public String suitToString() { 
        return suit.toString();
    }
    
    /**
     *
     * @return prints card value
     */
    public String valueToString() {
        return value.getValue();
    }
    
    public String toString() { //print card suit and value
        return value.toString() + " of " + suit.toString();
    }
    
    /**
     *
     * @return
     */
    public String toStringWithIntegers() { //print card suit and numerical version of value
        return value.getCardInt() + " of " + suit.toString();
   }
    
    /**
     *  card sorting aid for deck and shuffle
     */
    public static void sortCardsBySuit() { 
            sortByValue = false;
    }
    
    /**
     *  card sorting aid for deck and shuffle
     */
    public static void sortCardsByValue() { 
            sortByValue = true;
    }
    
    /**
     *
     * @param card card object to compare with
     * @return compares suit and value to another card object.
     */
    public boolean sameAs( Card card ) {
      if ( ( value != card.value ) || ( suit != card.suit ) )
         return false;
      else
         return true;
   }

    public int compareTo(Object otherCardObj) { //another comparison used only for sorting cards and creating a deck.
        Card otherCard = (Card) otherCardObj;
        int value_difference =  value.compareTo(otherCard.value);
        int suit_difference =   suit.compareTo(otherCard.suit);
        
        if ( sortByValue ) {
         if ( value_difference != 0 )
            return value_difference;
         else
            return suit_difference;
      }
      else {
         if ( suit_difference != 0 )
            return suit_difference;
         else
            return value_difference;
      }
    }
}