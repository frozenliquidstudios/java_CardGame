package cardBase;

import java.util.Arrays;
import java.util.Collections;

public class CardValue implements Comparable {
    private String name;     // full name of value
    private String acronym;  // acronym of value, used in the image files
//  private static boolean aceIsHighest = true;
//  private static boolean twoIsHighest = true;
    
    private CardValue( String value_name, String value_acronym ) {
      name    = value_name;
      acronym = value_acronym;
    }
    
    // All card values
    
    public final static CardValue TWO   = new CardValue("Two",   "2" );
    public final static CardValue THREE = new CardValue("Three", "3" );
    public final static CardValue FOUR  = new CardValue("Four",  "4" );
    public final static CardValue FIVE  = new CardValue("Five",  "5" );
    public final static CardValue SIX   = new CardValue("Six",   "6" );
    public final static CardValue SEVEN = new CardValue("Seven", "7" );
    public final static CardValue EIGHT = new CardValue("Eight", "8" );
    public final static CardValue NINE  = new CardValue("Nine",  "9" );
    public final static CardValue TEN   = new CardValue("Ten",   "10");
    public final static CardValue JACK  = new CardValue("Jack",  "11");
    public final static CardValue QUEEN = new CardValue("Queen", "12");
    public final static CardValue KING  = new CardValue("King",  "13");
    public final static CardValue ACE   = new CardValue("Ace",   "14");
    
    /**
     * @return String form of value.
     */
    String getValue() {
        return name;
    }
    
    /**
     * @return get value acronym
     */
    public String getValueAcronym() {
        return acronym;
    }
    
    /**
     * @return get value as int
     */
    public int getCardInt() {
        return Integer.parseInt(acronym);
    }
    
    /**
     * @return print name of value eg. Jack
     */
    @Override
    public String toString() {
        return name;
    }
    
    // All values in a list for comparison.

    public final static java.util.List VALUES =
        Collections.unmodifiableList( Arrays.asList( new CardValue[] { TWO, THREE, FOUR, FIVE, SIX, SEVEN,
                                                                       EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }));
    @Override
    public int compareTo(Object otherValueObj) {
      CardValue otherValue = (CardValue) otherValueObj;
      return VALUES.indexOf( this ) - VALUES.indexOf( otherValue );
    }
}