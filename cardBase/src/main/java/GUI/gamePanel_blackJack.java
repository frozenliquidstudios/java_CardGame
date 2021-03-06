package GUI;

import static GUI.MainMenuLayout.show_main_menu;
import cardBase.*;
import gameTypes.blackJack;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class gamePanel_blackJack extends javax.swing.JPanel {
    
    private blackJack game;
    /**
     * Initializes the game view, sets card images and makes proper aspects visible.
     */
    public gamePanel_blackJack() {
        initComponents();       
        BufferedImage cardIMG = backside();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        myCard1.setIcon     (new ImageIcon(scaledCard));
        myCard2.setIcon     (new ImageIcon(scaledCard));
        dealerCard1.setIcon (new ImageIcon(scaledCard));
        dealerCard2.setIcon (new ImageIcon(scaledCard));
        hideGameFunctions();
        hideExtraCards();
        gameover_popupJPanel.setVisible (false);
        gameover_closePopup.setVisible  (false);
        gameover_desc.setVisible        (false);
        gameover_title.setVisible       (false);       
        continueButton.setVisible       (false);
        dealerValue_label.setVisible    (false);
        dealerValue_variable.setVisible (false);
        myValue_label.setVisible        (false);
        myValue_variable.setVisible     (false);
        result_label.setVisible         (false);
        
        restartButton.setText       ("start!");
        restartButton.setVisible    (true);
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameover_popupJPanel = new javax.swing.JPanel();
        gameover_desc = new javax.swing.JLabel();
        gameover_title = new javax.swing.JLabel();
        gameover_closePopup = new javax.swing.JButton();
        myCard1 = new javax.swing.JLabel();
        myCard2 = new javax.swing.JLabel();
        myCard3 = new javax.swing.JLabel();
        myCard4 = new javax.swing.JLabel();
        myCard5 = new javax.swing.JLabel();
        myScore_text = new javax.swing.JLabel();
        myScore_end_text = new javax.swing.JLabel();
        myScore_value = new javax.swing.JLabel();
        stayButton = new javax.swing.JButton();
        dealButton = new javax.swing.JButton();
        text_or = new javax.swing.JLabel();
        backToMenu = new javax.swing.JButton();
        dealerScore_text = new javax.swing.JLabel();
        dealerScore_end_text = new javax.swing.JLabel();
        dealerScore_value = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        dealerCard3 = new javax.swing.JLabel();
        dealerCard4 = new javax.swing.JLabel();
        dealerCard5 = new javax.swing.JLabel();
        myValue_label = new javax.swing.JLabel();
        myValue_variable = new javax.swing.JLabel();
        dealerValue_label = new javax.swing.JLabel();
        dealerValue_variable = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        result_label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(null);

        gameover_popupJPanel.setBackground(new java.awt.Color(0, 204, 0));
        gameover_popupJPanel.setLayout(null);

        gameover_desc.setFont(new java.awt.Font("04b03", 0, 30)); // NOI18N
        gameover_desc.setForeground(new java.awt.Color(255, 255, 255));
        gameover_desc.setText("YOU WON :D");
        gameover_popupJPanel.add(gameover_desc);
        gameover_desc.setBounds(90, 70, 180, 60);

        gameover_title.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        gameover_title.setForeground(new java.awt.Color(255, 255, 255));
        gameover_title.setText("CONGRATULATIONS!");
        gameover_popupJPanel.add(gameover_title);
        gameover_title.setBounds(20, 20, 340, 40);

        gameover_closePopup.setBackground(new java.awt.Color(0, 204, 102));
        gameover_closePopup.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        gameover_closePopup.setForeground(new java.awt.Color(255, 255, 255));
        gameover_closePopup.setText("GO");
        gameover_closePopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameover_closePopupActionPerformed(evt);
            }
        });
        gameover_popupJPanel.add(gameover_closePopup);
        gameover_closePopup.setBounds(140, 140, 80, 40);

        add(gameover_popupJPanel);
        gameover_popupJPanel.setBounds(270, 150, 360, 190);

        myCard1.setText("mycard2");
        add(myCard1);
        myCard1.setBounds(440, 290, 90, 130);

        myCard2.setText("mycard1");
        add(myCard2);
        myCard2.setBounds(340, 290, 90, 130);

        myCard3.setText("mycard3");
        add(myCard3);
        myCard3.setBounds(540, 290, 90, 130);

        myCard4.setText("mycard4");
        add(myCard4);
        myCard4.setBounds(640, 290, 90, 130);

        myCard5.setText("mycard5");
        add(myCard5);
        myCard5.setBounds(740, 290, 90, 130);

        myScore_text.setFont(new java.awt.Font("04b03", 0, 48)); // NOI18N
        myScore_text.setText("your score:");
        add(myScore_text);
        myScore_text.setBounds(210, 500, 290, 50);

        myScore_end_text.setFont(new java.awt.Font("04b03", 0, 40)); // NOI18N
        myScore_end_text.setText("/ 5");
        add(myScore_end_text);
        myScore_end_text.setBounds(580, 480, 100, 90);

        myScore_value.setFont(new java.awt.Font("04b03", 0, 70)); // NOI18N
        myScore_value.setForeground(new java.awt.Color(0, 204, 0));
        myScore_value.setText("0");
        add(myScore_value);
        myScore_value.setBounds(520, 480, 60, 90);

        stayButton.setFont(new java.awt.Font("04b03", 0, 25)); // NOI18N
        stayButton.setText("stay");
        stayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stayButtonActionPerformed(evt);
            }
        });
        add(stayButton);
        stayButton.setBounds(240, 440, 150, 50);

        dealButton.setFont(new java.awt.Font("04b03", 0, 25)); // NOI18N
        dealButton.setText("deal one");
        dealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealButtonActionPerformed(evt);
            }
        });
        add(dealButton);
        dealButton.setBounds(470, 440, 149, 50);

        text_or.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        text_or.setText("or");
        add(text_or);
        text_or.setBounds(420, 450, 27, 24);

        backToMenu.setFont(new java.awt.Font("04b03", 1, 48)); // NOI18N
        backToMenu.setText("<-");
        backToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuActionPerformed(evt);
            }
        });
        add(backToMenu);
        backToMenu.setBounds(0, 0, 90, 40);

        dealerScore_text.setFont(new java.awt.Font("04b03", 0, 48)); // NOI18N
        dealerScore_text.setText("dealer score:");
        add(dealerScore_text);
        dealerScore_text.setBounds(170, 10, 330, 50);

        dealerScore_end_text.setFont(new java.awt.Font("04b03", 0, 40)); // NOI18N
        dealerScore_end_text.setText("/ 5");
        add(dealerScore_end_text);
        dealerScore_end_text.setBounds(580, -10, 100, 90);

        dealerScore_value.setFont(new java.awt.Font("04b03", 0, 70)); // NOI18N
        dealerScore_value.setForeground(new java.awt.Color(255, 0, 51));
        dealerScore_value.setText("0");
        add(dealerScore_value);
        dealerScore_value.setBounds(520, -10, 60, 90);

        dealerCard1.setText("dealerCard1");
        add(dealerCard1);
        dealerCard1.setBounds(340, 70, 90, 130);

        dealerCard2.setText("dealerCard2");
        add(dealerCard2);
        dealerCard2.setBounds(440, 70, 90, 130);

        dealerCard3.setText("dealerCard3");
        add(dealerCard3);
        dealerCard3.setBounds(540, 70, 90, 130);

        dealerCard4.setText("dealerCard4");
        add(dealerCard4);
        dealerCard4.setBounds(640, 70, 90, 130);

        dealerCard5.setText("dealerCard5");
        add(dealerCard5);
        dealerCard5.setBounds(740, 70, 90, 130);

        myValue_label.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        myValue_label.setText("Value:");
        add(myValue_label);
        myValue_label.setBounds(10, 360, 110, 30);

        myValue_variable.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        myValue_variable.setForeground(new java.awt.Color(0, 204, 0));
        myValue_variable.setText("0");
        add(myValue_variable);
        myValue_variable.setBounds(120, 330, 80, 90);

        dealerValue_label.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        dealerValue_label.setText("Value:");
        add(dealerValue_label);
        dealerValue_label.setBounds(10, 100, 100, 40);

        dealerValue_variable.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        dealerValue_variable.setForeground(new java.awt.Color(255, 0, 51));
        dealerValue_variable.setText("0");
        add(dealerValue_variable);
        dealerValue_variable.setBounds(120, 82, 210, 78);

        continueButton.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        continueButton.setText("continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        add(continueButton);
        continueButton.setBounds(330, 220, 210, 50);

        restartButton.setFont(new java.awt.Font("04b03", 0, 36)); // NOI18N
        restartButton.setText("restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });
        add(restartButton);
        restartButton.setBounds(330, 220, 210, 50);

        result_label.setFont(new java.awt.Font("Impact", 0, 50)); // NOI18N
        result_label.setText("RESULT");
        add(result_label);
        result_label.setBounds(10, 210, 340, 70);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Player wants no more cards, or Stays. If dealer has under 17 value, deals him more cards until value > 17.
     * Once enough cards are dealt, shows card images and end results. Adds +1 to winners score and enables continue button.
     * Also hides game layout until continue is pressed.
     */
    private void stayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stayButtonActionPerformed
        if(game.getDealerHandValue() < 17) {
                setDealerCardImage(2);
                setDealerCardVisible(2);
                int cardNumber = 3;
                    for(int i=game.getDealerHandValue(); i < 17;) {  
                        game.dealDealerOneCard();
                        setDealerCardImage  (cardNumber);
                        setDealerCardVisible(cardNumber);
                        cardNumber++;
                        i = game.getDealerHandValue();
                        myValue_variable.setText    (game.getMyHandValue() + "");
                        dealerValue_variable.setText(game.getDealerHandValue() + "");
                    }
        } else {
            setDealerCardImage(2);
            setDealerCardVisible(2);
        }      
                if(game.getDealerHandValue() > 21 || game.getMyHandValue() > game.getDealerHandValue()) {
                    game.addMyScore();
                    continueButton.setText      ("next!");
                    continueButton.setVisible   (true);
                    restartButton.setVisible    (false);
                    myScore_value.setText       (game.getMyScore() + "");
                    myValue_variable.setText    (game.getMyHandValue() + "");
                    dealerValue_variable.setText(game.getDealerHandValue() + "");
                    
                    result_label.setText        ("YOU WON :D");
                    result_label.setForeground  (Color.GREEN);
                    result_label.setVisible     (true);
                    
                    hideGameFunctions();                    
                } else if(game.getMyHandValue() == game.getDealerHandValue()) {
                    continueButton.setText      ("next!");
                    continueButton.setVisible   (true);
                    restartButton.setVisible    (false);
                    myScore_value.setText       (game.getMyScore() + "");
                    myValue_variable.setText    (game.getMyHandValue() + "");
                    dealerValue_variable.setText(game.getDealerHandValue() + "");
                    
                    result_label.setText        ("TIE :/");
                    result_label.setForeground  (Color.YELLOW);
                    result_label.setVisible     (true);
                } else {
                    game.addDealerScore();
                    continueButton.setText      ("next!");
                    continueButton.setVisible   (true);
                    restartButton.setVisible    (false);
                    dealerScore_value.setText   (game.getDealerScore() + "");
                    myValue_variable.setText    (game.getMyHandValue() + "");
                    dealerValue_variable.setText(game.getDealerHandValue() + "");
                    
                    result_label.setText        ("YOU LOST :(");
                    result_label.setForeground  (Color.RED);
                    result_label.setVisible     (true);
                    
                    hideGameFunctions();
                }     
    }//GEN-LAST:event_stayButtonActionPerformed
    /**
     * Deals one more card to player and checks if value exceeds 21.
     * If value does not exceed 21, player can deal a new card.
     * If value exceeds 21, player loses the round.
     */
    private void dealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealButtonActionPerformed
        game.dealPlayerOneCard();
        setMyCardImage  (game.getMyHandSize());
        setMyCardVisible(game.getMyHandSize());
        myValue_variable.setText(game.getMyHandValue() + "");
            if(game.getMyHandValue() > 21) {
                game.addDealerScore();
                continueButton.setText      ("next!");
                continueButton.setVisible   (true);
                restartButton.setVisible    (false);
                dealerScore_value.setText   (game.getDealerScore() + "");
                myValue_variable.setText    (game.getMyHandValue() + "");
                dealerValue_variable.setText(game.getDealerHandValue() + "");
                result_label.setText        ("YOU LOST :(");
                result_label.setForeground  (Color.RED);
                result_label.setVisible     (true);
                setDealerCardImage(2);
                hideGameFunctions();
            } 
    }//GEN-LAST:event_dealButtonActionPerformed
    /**
     * Checks if game is over, if it isn't, starts next round.
     * Makes proper GUI aspects visible.
     */
    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
                result_label.setVisible(false);
        
                if(game.getDealerScore() == 5) {
                    hideGameFunctions();
                    hideExtraCards();
                    continueButton.setVisible(false);
                    restartButton.setVisible (true);
                }
                else if(game.getMyScore() == 5) {
                    hideGameFunctions();
                    hideExtraCards();
                    continueButton.setVisible       (false);
                    restartButton.setVisible        (false);
                    gameover_popupJPanel.setVisible (true);
                    gameover_closePopup.setVisible  (true);
                    gameover_desc.setVisible        (true);
                    gameover_title.setVisible       (true);
                } else {                    
                    hideExtraCards();
                    game.dealNewHands();
                    myScore_value.setText(game.getMyScore() + "");
                    dealerScore_value.setText(game.getDealerScore() + "");
                    setMyCardImage(1);
                    setMyCardImage(2);
                    setDealerCardImage(0);
                    setDealerCardImage(1);
       
                        if(game.isOver()) {
                            hideGameFunctions();
                            hideExtraCards();
                            continueButton.setVisible (false);
                            restartButton.setVisible  (true);
                        } else {
                            hideExtraCards();
                            myValue_variable.setText    (game.getMyHandValue() + "");
                            dealerValue_variable.setText(game.getDealerFirstCardValue() + " + ?");
                            showGameFunctions();
                        } 
                }
    }//GEN-LAST:event_continueButtonActionPerformed
    /**
     * Shows main menu panel.
     */
    private void backToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuActionPerformed
        show_main_menu();
    }//GEN-LAST:event_backToMenuActionPerformed
    /**
     * Once game is won, popup needs to be closed with this button.
     * Once closed, restart button is shown.
     */
    private void gameover_closePopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameover_closePopupActionPerformed
        BufferedImage cardIMG = backside();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        myCard1.setIcon    (new ImageIcon(scaledCard));
        myCard2.setIcon    (new ImageIcon(scaledCard));
        dealerCard1.setIcon(new ImageIcon(scaledCard));
        dealerCard2.setIcon(new ImageIcon(scaledCard));
        hideGameFunctions();
        hideExtraCards();
        gameover_popupJPanel.setVisible (false);
        gameover_closePopup.setVisible  (false);
        gameover_desc.setVisible        (false);
        gameover_title.setVisible       (false);       
        continueButton.setVisible       (false);
        dealerValue_label.setVisible    (false);
        dealerValue_variable.setVisible (false);
        myValue_label.setVisible        (false);
        myValue_variable.setVisible     (false);
        result_label.setVisible         (false);
        
        restartButton.setText       ("start!");
        restartButton.setVisible    (true);
    }//GEN-LAST:event_gameover_closePopupActionPerformed
    
    /**
     * Restarts game.
     */
    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        restartButton.setText       ("restart!");
        hideExtraCards();
        hideGameFunctions();
        continueButton.setVisible       (true);
        restartButton.setVisible        (false);       
        myValue_variable.setVisible     (false);
        myValue_label.setVisible        (false);
        dealerValue_variable.setVisible (false);
        dealerValue_label.setVisible    (false);
        
        BufferedImage cardIMG = backside();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        myCard1.setIcon(new ImageIcon(scaledCard));
        myCard2.setIcon(new ImageIcon(scaledCard));
        dealerCard1.setIcon(new ImageIcon(scaledCard));
        dealerCard2.setIcon(new ImageIcon(scaledCard));
        
        game = new blackJack();       
    }//GEN-LAST:event_restartButtonActionPerformed
    
// CUSTOM FUNCTIONS
    
    /**
     * Sets players card images according to @param.
     * @param num Card number in question.
     */
        
    public void setMyCardImage(int num) {
        if(num == 1) {
            BufferedImage cardIMG = game.getCardImages("myCard1");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            myCard1.setIcon(new ImageIcon(scaledCard));
        } else if(num == 2) { 
            BufferedImage cardIMG = game.getCardImages("myCard2");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            myCard2.setIcon(new ImageIcon(scaledCard));                    
        } else if(num == 3) { 
            BufferedImage cardIMG = game.getCardImages("myCard3");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            myCard3.setIcon(new ImageIcon(scaledCard));                    
        } else if(num == 4) { 
            BufferedImage cardIMG = game.getCardImages("myCard4");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            myCard4.setIcon(new ImageIcon(scaledCard));                    
        } else if(num == 5) { 
            BufferedImage cardIMG = game.getCardImages("myCard5");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            myCard5.setIcon(new ImageIcon(scaledCard));                    
        }
    }
    
    /**
     * Sets dealers card images according to @param.
     * @param num Card number in question.
     */
    public void setDealerCardImage(int num) {
        if(num == 0) {
            BufferedImage cardIMG = backside();
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard2.setIcon(new ImageIcon(scaledCard));
        } else if(num == 1) {
            BufferedImage cardIMG = game.getCardImages("dealerCard1");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard1.setIcon(new ImageIcon(scaledCard));
        } else if(num == 2) { 
            BufferedImage cardIMG = game.getCardImages("dealerCard2");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard2.setIcon(new ImageIcon(scaledCard));
        } else if(num == 3) { 
            BufferedImage cardIMG = game.getCardImages("dealerCard3");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard3.setIcon(new ImageIcon(scaledCard));
        } else if(num == 4) { 
            BufferedImage cardIMG = game.getCardImages("dealerCard4");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard4.setIcon(new ImageIcon(scaledCard));
        } else if(num == 5) { 
            BufferedImage cardIMG = game.getCardImages("dealerCard5");
            Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
            dealerCard5.setIcon(new ImageIcon(scaledCard));
        }
    }
    
    /**
     * Sets dealers card visible according to param.
     * @param cardNumber Card number in question.
     */
    public void setDealerCardVisible(int cardNumber) {
        if(cardNumber == 1) {
            dealerCard1.setVisible(true);
        } else if(cardNumber == 2) {
           dealerCard2.setVisible(true); 
        } else if(cardNumber == 3) {
           dealerCard3.setVisible(true); 
        } else if(cardNumber == 4) {
           dealerCard4.setVisible(true); 
        } else if(cardNumber == 5) {
           dealerCard5.setVisible(true); 
        }
    }
    
    /**
     * Sets players card visible according to param.
     * @param cardNumber Card number in question.
     */
    public void setMyCardVisible(int cardNumber) {
        if(cardNumber == 1) {
            myCard1.setVisible(true);
        } else if(cardNumber == 2) {
           myCard2.setVisible(true); 
        } else if(cardNumber == 3) {
           myCard3.setVisible(true); 
        } else if(cardNumber == 4) {
           myCard4.setVisible(true); 
        } else if(cardNumber == 5) {
           myCard5.setVisible(true); 
        }
    }
        
    /**
     * 
     * @return Image of card backside.
     */
    public BufferedImage backside() {
        BufferedImage img = null; // Initializes image as null.
                   try {
                        img = ImageIO.read(getClass().getResourceAsStream("/cardImages/back.png")); // Places proper image path to img variable
                    } catch (IOException e) {
                        e.printStackTrace();  // Traces any errors
                    }
        return img;
    }
    
    /**
     * Hides card slots determined by possible cards dealt to player and dealer later in the round.
     */
    public void hideExtraCards() {
        myCard3.setVisible              (false);
        myCard4.setVisible              (false);
        myCard5.setVisible              (false);
        dealerCard3.setVisible          (false);
        dealerCard4.setVisible          (false);
        dealerCard5.setVisible          (false);
    }
    
    /**
     * Hides labels and buttons that are only needed during a game. 
     */
    public void hideGameFunctions() {
        stayButton.setVisible           (false);
        dealButton.setVisible           (false);
        text_or.setVisible              (false);
        dealerScore_end_text.setVisible (false);
        dealerScore_text.setVisible     (false);
        dealerScore_value.setVisible    (false);
        myScore_end_text.setVisible     (false);
        myScore_text.setVisible         (false);
        myScore_value.setVisible        (false);
    }

    /**
     * Shows labels and buttons that are only needed during a game. 
     */
    public void showGameFunctions() {
        stayButton.setVisible           (true);
        dealButton.setVisible           (true);
        text_or.setVisible              (true);
        dealerScore_end_text.setVisible (true);
        dealerScore_text.setVisible     (true);
        dealerScore_value.setVisible    (true);
        dealerValue_label.setVisible    (true);
        dealerValue_variable.setVisible (true);
        myScore_end_text.setVisible     (true);
        myScore_text.setVisible         (true);
        myScore_value.setVisible        (true);
        myValue_label.setVisible        (true);
        myValue_variable.setVisible     (true);
        restartButton.setVisible        (false);
        continueButton.setVisible       (false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenu;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton dealButton;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerCard3;
    private javax.swing.JLabel dealerCard4;
    private javax.swing.JLabel dealerCard5;
    private javax.swing.JLabel dealerScore_end_text;
    private javax.swing.JLabel dealerScore_text;
    private javax.swing.JLabel dealerScore_value;
    private javax.swing.JLabel dealerValue_label;
    private javax.swing.JLabel dealerValue_variable;
    private javax.swing.JButton gameover_closePopup;
    private javax.swing.JLabel gameover_desc;
    private javax.swing.JPanel gameover_popupJPanel;
    private javax.swing.JLabel gameover_title;
    private javax.swing.JLabel myCard1;
    private javax.swing.JLabel myCard2;
    private javax.swing.JLabel myCard3;
    private javax.swing.JLabel myCard4;
    private javax.swing.JLabel myCard5;
    private javax.swing.JLabel myScore_end_text;
    private javax.swing.JLabel myScore_text;
    private javax.swing.JLabel myScore_value;
    private javax.swing.JLabel myValue_label;
    private javax.swing.JLabel myValue_variable;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel result_label;
    private javax.swing.JButton stayButton;
    private javax.swing.JLabel text_or;
    // End of variables declaration//GEN-END:variables
}

