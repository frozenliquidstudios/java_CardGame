package GUI;

import cardBase.*;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;

public class cardBaseGUI extends javax.swing.JFrame {
    
    private CardDeck deck = new CardDeck();
    
    public cardBaseGUI() {      
        initComponents();
    //    cardImage.setIcon(new ImageIcon("C:/Users/LiQuid/java_CardGame/cardBase/src/main/java/cardImages/back.png"));
        deck = new CardDeck();
        deck.fillDeck();       
        cardCount.setText(deck.getRemainingCards() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dealCardBtn = new javax.swing.JButton();
        getFreshDeckBtn = new javax.swing.JButton();
        cardCount = new javax.swing.JLabel();
        CardsRemaining = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        play_highLow_button = new javax.swing.JButton();
        cardImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cardBase");
        setName("cardBase"); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);

        dealCardBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dealCardBtn.setText("Deal a Card");
        dealCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealCardBtnActionPerformed(evt);
            }
        });

        getFreshDeckBtn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getFreshDeckBtn.setText("Get a Fresh Deck");
        getFreshDeckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFreshDeckBtnActionPerformed(evt);
            }
        });

        cardCount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardCount.setText("---");

        CardsRemaining.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CardsRemaining.setText("Cards left in deck:");

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        logoLabel.setFont(new java.awt.Font("04b03", 0, 48)); // NOI18N
        logoLabel.setText("cardBase");

        play_highLow_button.setFont(new java.awt.Font("04b03", 0, 24)); // NOI18N
        play_highLow_button.setText("highLow");
        play_highLow_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_highLow_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(CardsRemaining)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(logoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(play_highLow_button, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getFreshDeckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealCardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(logoLabel)
                                .addGap(35, 35, 35)
                                .addComponent(play_highLow_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dealCardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(getFreshDeckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardsRemaining))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getFreshDeckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFreshDeckBtnActionPerformed
        deck = new CardDeck();
        deck.fillDeck();       
        cardCount.setText(deck.getRemainingCards() + "");
        dealCardBtn.setEnabled(true);

        //Checks if file path is correct
/*      File file = new File("src/main/java/cardImages/c2.png");
        System.out.println("File exists: " + file.exists());
        System.out.println(file.getAbsolutePath()); */
    }//GEN-LAST:event_getFreshDeckBtnActionPerformed

    private void dealCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealCardBtnActionPerformed
        Card card = deck.dealCard();
        BufferedImage cardIMG = card.getCardImage();
        Image scaledCard = cardIMG.getScaledInstance( 90, 138,  java.awt.Image.SCALE_SMOOTH ) ;
        cardImage.setIcon(new ImageIcon(scaledCard));
        cardCount.setText(deck.getRemainingCards() + "");
        
        if ( deck.getRemainingCards() == 0 )
		    dealCardBtn.setEnabled(false);   
    }//GEN-LAST:event_dealCardBtnActionPerformed

    private void play_highLow_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_highLow_buttonActionPerformed
        cardBaseGUI.this.dispose();
        cardBaseGUI.this.setVisible(false);
        new game_highLow().setVisible(true);
    }//GEN-LAST:event_play_highLow_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cardBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardBaseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CardsRemaining;
    private javax.swing.JLabel cardCount;
    private javax.swing.JLabel cardImage;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton dealCardBtn;
    private javax.swing.JButton getFreshDeckBtn;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton play_highLow_button;
    // End of variables declaration//GEN-END:variables
}