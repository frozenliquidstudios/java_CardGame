package cardBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

 public Main() {
 
 }
 
 public static void main(String[] args) {
        
        CardDeck deck = new CardDeck();
        deck.fillDeck();
        System.out.println("Pakassa on " + deck.getDeckSize() + " korttia.");
        GameMode mode = new GameMode();
        mode.setGameMode("Pokeri");       
        System.out.println("Pelimuoto on " + mode.getGameMode());

    }
}
