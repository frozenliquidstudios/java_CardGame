package cardBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

 public Main() {
 
 }
 
 public static void main(String[] args) {
        System.out.println("Main luokka initialized.");
        
        CardDeck deck = new CardDeck();
        System.out.println("Pakassa on " + deck.getDeckSize() + " korttia.");
        
        GameMode mode = new GameMode();
        mode.setGameMode("Pokeri");       
        System.out.println("Pelimuoto on " + mode.getGameMode());
     // System.out.println(deck);     //Prints all cards in a shuffled deck.
     //   System.out.println();
        
    //    System.out.println(deck.length);
  
    }
}
