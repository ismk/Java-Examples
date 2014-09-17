/*
 * BadmintonServer.java
 *
 * These program create and use a class to act as a server for RMI application
 *
 * Copyright (c) 2007 Aptech Software Limited. All Rights Reserved.
 */

package badminton;

import java.awt.Color;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  Vincent
 */
public class BadmintonServer extends javax.swing.JFrame {
    
    /**
     * Creates new form BadmintonServer
     */
    public BadmintonServer() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        
        getContentPane().setBackground(new Color(212,208,200));
        initComponents();
        
        scores = new Scores();
        try {
            serverImpl = new ScoresImpl(scores);
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/BadmintonServer",serverImpl);
            setIndex = 0;
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblHeader = new javax.swing.JLabel();
        pnlPlayer = new javax.swing.JPanel();
        lblPlayer1 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        lblPlayer2 = new javax.swing.JLabel();
        txtPlayer2 = new javax.swing.JTextField();
        pnlSets = new javax.swing.JPanel();
        txtPlayer1Set1 = new javax.swing.JTextField();
        txtPlayer1Set2 = new javax.swing.JTextField();
        txtPlayer1Set3 = new javax.swing.JTextField();
        txtPlayer2Set1 = new javax.swing.JTextField();
        txtPlayer2Set2 = new javax.swing.JTextField();
        txtPlayer2Set3 = new javax.swing.JTextField();
        btnSetOver = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 7, 7));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Score Board");
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Badminton Score Board");
        lblHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHeader.setPreferredSize(new java.awt.Dimension(520, 40));
        getContentPane().add(lblHeader);

        pnlPlayer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        pnlPlayer.setEnabled(false);
        pnlPlayer.setPreferredSize(new java.awt.Dimension(240, 100));
        lblPlayer1.setText("Player  1");
        lblPlayer1.setPreferredSize(new java.awt.Dimension(70, 20));
        pnlPlayer.add(lblPlayer1);

        txtPlayer1.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlPlayer.add(txtPlayer1);

        lblPlayer2.setText("Player  2");
        lblPlayer2.setPreferredSize(new java.awt.Dimension(70, 20));
        pnlPlayer.add(lblPlayer2);

        txtPlayer2.setPreferredSize(new java.awt.Dimension(140, 20));
        pnlPlayer.add(txtPlayer2);

        getContentPane().add(pnlPlayer);

        pnlSets.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 35, 10));

        pnlSets.setBorder(javax.swing.BorderFactory.createTitledBorder("Sets"));
        pnlSets.setPreferredSize(new java.awt.Dimension(270, 100));
        txtPlayer1Set1.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer1Set1);

        txtPlayer1Set2.setText("0");
        txtPlayer1Set2.setEnabled(false);
        txtPlayer1Set2.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer1Set2);

        txtPlayer1Set3.setText("0");
        txtPlayer1Set3.setEnabled(false);
        txtPlayer1Set3.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer1Set3);

        txtPlayer2Set1.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer2Set1);

        txtPlayer2Set2.setText("0");
        txtPlayer2Set2.setEnabled(false);
        txtPlayer2Set2.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer2Set2);

        txtPlayer2Set3.setText("0");
        txtPlayer2Set3.setEnabled(false);
        txtPlayer2Set3.setPreferredSize(new java.awt.Dimension(40, 20));
        pnlSets.add(txtPlayer2Set3);

        getContentPane().add(pnlSets);

        btnSetOver.setText("Set Over");
        btnSetOver.setPreferredSize(new java.awt.Dimension(100, 23));
        btnSetOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetOverActionPerformed(evt);
            }
        });

        getContentPane().add(btnSetOver);

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        getContentPane().add(btnSave);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-560)/2, (screenSize.height-220)/2, 560, 220);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
// TODO add your handling code here:
        setChange();
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnSetOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetOverActionPerformed
// TODO add your handling code here:
        if (setChange()){
            switch(++setIndex) {
                case 1:
                    txtPlayer1Set1.setEnabled(false);
                    txtPlayer2Set1.setEnabled(false);
                    
                    txtPlayer1Set2.setEnabled(true);
                    txtPlayer2Set2.setEnabled(true);
                    break;
                    
                case 2:
                    txtPlayer1Set2.setEnabled(false);
                    txtPlayer2Set2.setEnabled(false);
                    
                    txtPlayer1Set3.setEnabled(true);
                    txtPlayer2Set3.setEnabled(true);
                    break;
                    
                case 3:
                    txtPlayer1Set3.setEnabled(false);
                    txtPlayer2Set3.setEnabled(false);
                    break;
                    
            }
        }
    }//GEN-LAST:event_btnSetOverActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BadmintonServer().setVisible(true);
            }
        });
    }

    public boolean setChange() {
        scores.setNames(txtPlayer1.getText(),txtPlayer2.getText());
        
        try {
            int player1Set1 = 0;
            int player2Set1 = 0;
            int player1Set2 = 0;
            int player2Set2 = 0;
            int player1Set3 = 0;
            int player2Set3 = 0;
            
            player1Set1 = Integer.parseInt(txtPlayer1Set1.getText().trim());
            player2Set1 = Integer.parseInt(txtPlayer2Set1.getText().trim());
            
            scores.setSet1Score(player1Set1,player2Set1);
            
            player1Set2 = Integer.parseInt(txtPlayer1Set2.getText().trim());
            player2Set2 = Integer.parseInt(txtPlayer2Set2.getText().trim());
            
            scores.setSet2Score(player1Set2,player2Set2);
            
            player1Set3 = Integer.parseInt(txtPlayer1Set3.getText().trim());
            player2Set3 = Integer.parseInt(txtPlayer2Set3.getText().trim());
            
            scores.setSet3Score(player1Set3,player2Set3);
            return true;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Enter a valid Score","Invalid Score",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSetOver;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JPanel pnlPlayer;
    private javax.swing.JPanel pnlSets;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer1Set1;
    private javax.swing.JTextField txtPlayer1Set2;
    private javax.swing.JTextField txtPlayer1Set3;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer2Set1;
    private javax.swing.JTextField txtPlayer2Set2;
    private javax.swing.JTextField txtPlayer2Set3;
    // End of variables declaration//GEN-END:variables
    ScoresImpl serverImpl;
    Scores scores;
    int setIndex;
}