package cardBase;

public class Card {
    private CardSuit suit;
    private CardValue value;
    
    public Card (CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public CardSuit getCardSuit() {
        return suit;
    }
    
    public void setCardSuit(CardSuit suit) {
        this.suit = suit;
    }
    
    public CardValue getCardValue() {
        return value;
    }
    
    public void SetCardValue(CardValue value) {
        this.value = value;
    }
}
