package GUI;

import GUI.*;
import highScores.HighScoreManager;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MainMenuLayout {
    private JFrame frame = new JFrame("cardBase");
    private static JPanel panelContainer = new JPanel();
    private static JPanel mainMenu = new mainMenu();
    private static JPanel game_highLow = new gamePanel_highLow();
    
    private static CardLayout cl = new CardLayout();
    
    /**
     * Initializes Main Layout components for card view
     */
    public MainMenuLayout() {
        panelContainer.setLayout(cl);
        
        panelContainer.add(mainMenu, "mainMenu");
        panelContainer.add(game_highLow, "highLow");       
        cl.show(panelContainer, "mainMenu");
        
        HighScoreManager scores = new HighScoreManager();
        scores.addScore("CoolKid",240);
        scores.addScore("KidCool",300);
        scores.addScore("Dude",220);
        scores.addScore("Mayne",100);
        scores.addScore("YOYO",270);

        System.out.print(scores.getHighscoreString());
        
        frame.add(panelContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Moves to game panel if pressed
     */
    public static void button_game_highLow() {
        cl.show(panelContainer, "highLow");
    }
    
    /**
     *
     * @param args Runs main layout
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
