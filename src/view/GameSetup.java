/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.GameSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Anuradha
 */
public class GameSetup extends javax.swing.JFrame implements Observer {

    private static GameSetup gameSetup = null;

    /**
     * Creates new form GameSetup
     */
    public GameSetup() {
        initComponents();

//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.setUndecorated(true);
        gridOnCheckBox.setOpaque(false);
        joinBtn.setOpaque(false);
        joinBtn.setContentAreaFilled(false);
        quitBtn.setOpaque(false);
        quitBtn.setContentAreaFilled(false);
        aboutBtn.setOpaque(false);
        aboutBtn.setContentAreaFilled(false);

        FileInputStream imgStream = null;
        try {
            File imgfile = new File("..\\Desolator\\src\\images\\Tank-Bonus-icon.png");
            imgStream = new FileInputStream(imgfile);
            BufferedImage bi = ImageIO.read(imgStream);
            ImageIcon myImg = new ImageIcon(bi);
            this.setIconImage(myImg.getImage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameSetup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameSetup.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                imgStream.close();
            } catch (IOException ex) {
                Logger.getLogger(GameSetup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        setLocationRelativeTo(null);

        gameSetup = this;
    }

    public static GameSetup getInstance() {
        return gameSetup;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        portOutTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        portInTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        joinBtn = new javax.swing.JButton();
        gridOnCheckBox = new javax.swing.JCheckBox();
        serverIPTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desolator Tank Client");
        setMinimumSize(new java.awt.Dimension(627, 525));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        infoLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(infoLabel);
        infoLabel.setBounds(10, 10, 600, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 480, 630, 50);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("in");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 190, 20, 20);

        portOutTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        portOutTextField.setText("6000");
        portOutTextField.setAutoscrolls(false);
        getContentPane().add(portOutTextField);
        portOutTextField.setBounds(240, 190, 50, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("out");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 190, 20, 20);

        portInTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        portInTextField.setText("7000");
        portInTextField.setAutoscrolls(false);
        portInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portInTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(portInTextField);
        portInTextField.setBounds(160, 190, 50, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Port");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 60, 20);

        aboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutBtn.setText("About");
        aboutBtn.setToolTipText("");
        aboutBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        aboutBtn.setMaximumSize(new java.awt.Dimension(21, 21));
        aboutBtn.setMinimumSize(new java.awt.Dimension(21, 21));
        aboutBtn.setOpaque(false);
        aboutBtn.setPreferredSize(new java.awt.Dimension(21, 21));
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(40, 330, 70, 70);

        quitBtn.setForeground(new java.awt.Color(255, 255, 255));
        quitBtn.setText("Quit");
        quitBtn.setToolTipText("Click here to exit");
        quitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        quitBtn.setMaximumSize(new java.awt.Dimension(21, 21));
        quitBtn.setMinimumSize(new java.awt.Dimension(21, 21));
        quitBtn.setOpaque(false);
        quitBtn.setPreferredSize(new java.awt.Dimension(21, 21));
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn);
        quitBtn.setBounds(120, 330, 70, 70);

        joinBtn.setForeground(new java.awt.Color(255, 255, 255));
        joinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PLayNowIcon.png"))); // NOI18N
        joinBtn.setToolTipText(null);
        joinBtn.setBorder(null);
        joinBtn.setOpaque(false);
        joinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                joinBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                joinBtnMouseExited(evt);
            }
        });
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });
        getContentPane().add(joinBtn);
        joinBtn.setBounds(330, 150, 260, 260);

        gridOnCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        gridOnCheckBox.setSelected(true);
        gridOnCheckBox.setText("Grid On");
        getContentPane().add(gridOnCheckBox);
        gridOnCheckBox.setBounds(60, 270, 130, 23);

        serverIPTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serverIPTextField.setText("127.0.0.1");
        serverIPTextField.setAutoscrolls(false);
        getContentPane().add(serverIPTextField);
        serverIPTextField.setBounds(140, 130, 150, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("General Setup");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 140, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Server IP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 60, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grid Settings");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 180, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 70, 630, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tw-logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 200, 60);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 630, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        //JOptionPane pane = new JOptionPane("Are you sure want to exit?", WARNING_MSG, WIDTH);
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_quitBtnActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed

        SwingWorker worker = new SwingWorker() {

            @Override
            protected Object doInBackground() throws Exception {
                System.out.println(javax.swing.SwingUtilities.isEventDispatchThread());
                String serverIP = serverIPTextField.getText();
                int portIn = Integer.parseInt(portInTextField.getText());
                int portOut = Integer.parseInt(portOutTextField.getText());
                boolean gridNeeded;
                if (gridOnCheckBox.isSelected()) {
                    gridNeeded = true;
                } else {
                    gridNeeded = false;
                }

                GameSession gs = new GameSession(serverIP, portIn, portOut);

                gs.initGame();

                GameView gameView = new GameView(gs, gridNeeded);

                gs.setGamePanel(gameView.getGamePanel());
//        boolean errorOccured = gs.startGame();
                gs.startGame();
//        if (!errorOccured) {

                gs.setObserver(gameView);
                gameView.setVisible(true);
                if (gameSetup != null) {
                    gameSetup.dispose();
                }
//        }else{
//            JOptionPane.showMessageDialog(this, "The client will now close");
//            System.exit(0);
//        }
                return null;
            }
        };
        worker.execute();


    }//GEN-LAST:event_joinBtnActionPerformed

    private void joinBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinBtnMouseEntered
        ImageIcon ii = new ImageIcon("../Desolator/src/images/PLayNowIconFocussed.png");
        joinBtn.setIcon(ii);
    }//GEN-LAST:event_joinBtnMouseEntered

    private void joinBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinBtnMouseExited
        ImageIcon ii = new ImageIcon("../Desolator/src/images/PLayNowIcon.png");
        joinBtn.setIcon(ii);
    }//GEN-LAST:event_joinBtnMouseExited

    private void portInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portInTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameSetup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JCheckBox gridOnCheckBox;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton joinBtn;
    private javax.swing.JTextField portInTextField;
    private javax.swing.JTextField portOutTextField;
    private javax.swing.JButton quitBtn;
    private javax.swing.JTextField serverIPTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (arg != null) {
            infoLabel.setText((String) arg);
            
            repaint();
        } else {
            infoLabel.setText(null);
        }
    }
}
