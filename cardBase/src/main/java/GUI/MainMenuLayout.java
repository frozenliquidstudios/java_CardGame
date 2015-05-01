package GUI;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainMenuLayout {

    public JFrame frame = new JFrame        ("cardBase");   // Creates new JFrame for the entire program
    public static JPanel panelContainer =   new JPanel();   // Makes JPanel which contains other panels, aka Card Format
    public static JPanel mainMenu =         new mainMenu(); // Makes new MainMenu    
    public static JPanel game_highLow =     new gamePanel_highLow();    // Initializes highLow game
    public static JPanel game_blackJack =   new gamePanel_blackJack();  // Initializes blackJack game      
    private static CardLayout cl = new CardLayout();    // Initializes card layout for GUI  
    
    /**
     * Initializes Main Layout components for card view
     */
    public MainMenuLayout() {
        panelContainer.setLayout(cl);
        
        panelContainer.add(mainMenu, "mainMenu");
        panelContainer.add(game_highLow, "highLow");
        panelContainer.add(game_blackJack, "blackJack");
        cl.show(panelContainer, "mainMenu");
        
        frame.add(panelContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Moves to highLow game panel
     */
    public static void button_game_highLow() {
        cl.show(panelContainer, "highLow");
    }
    
    /**
     * Moves to blackJack game panel
     */
    public static void button_game_blackJack() {
        cl.show(panelContainer, "blackJack");
    }
    
    /**
     * Moves to main menu panel
     */
    public static void show_main_menu() {
        cl.show(panelContainer, "mainMenu");
    }
    
    /**
     * Main run method of the program
     * @param args Runs main menu layout
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenuLayout();
            }           
        });
    }   
}
