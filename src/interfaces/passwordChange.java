/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.mysql.cj.protocol.Resultset;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class passwordChange extends javax.swing.JFrame {
    DBConnection db=new DBConnection();
    Connection conn=db.getMysqlConnect();
    private int prn;
    /**
     * Creates new form passwordChange
     */
    public passwordChange() {
        initComponents();
    }
    
        public passwordChange(int prn) {
        initComponents();
        this.prn=prn;

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JButton();
        oldPass = new javax.swing.JTextField();
        newPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newConfPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 350));
        setMinimumSize(new java.awt.Dimension(350, 350));
        setPreferredSize(new java.awt.Dimension(350, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        update.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        update.setText("change");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(67, 231, 90, 31);
        getContentPane().add(oldPass);
        oldPass.setBounds(130, 40, 154, 40);
        getContentPane().add(newPass);
        newPass.setBounds(130, 100, 154, 40);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Old:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 70, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("New:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 70, 20);
        getContentPane().add(newConfPass);
        newConfPass.setBounds(130, 160, 154, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Confirm:-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 80, 23);

        cancel.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(209, 231, 100, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/back2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(838, 510));
        jLabel4.setMinimumSize(new java.awt.Dimension(838, 510));
        jLabel4.setPreferredSize(new java.awt.Dimension(838, 510));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 838, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String old,newP,newCp,qry,actualP,qryUpdate;
            Statement stmt=conn.createStatement();
            Statement stmt2=conn.createStatement();

            old=oldPass.getText();
            newP=newPass.getText();
            newCp=newConfPass.getText();
            System.out.println(old+newP+newCp);
            qry="select prn,password from user where prn="+this.prn+";";
            System.out.println(qry);
            ResultSet rst=stmt.executeQuery(qry);
            int success=0;
            if(rst.next()){
                actualP=rst.getString("password");
                System.out.println(actualP);
              if(old.contentEquals(actualP)){
                  if(newP.contentEquals(newCp)){
                        qryUpdate="update user set password='"+newCp+"' where prn="+this.prn+";";
                        System.out.println(qryUpdate);
                        success=stmt2.executeUpdate(qryUpdate);
                        if(success>0 ){
                            JOptionPane.showMessageDialog(rootPane,"password updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        }
                  }else{
                        JOptionPane.showMessageDialog(rootPane,"password and confirm password not matched","Try again!", JOptionPane.ERROR_MESSAGE);
                        newPass.setText("");
                        newConfPass.setText("");
                  }
              }else{
                  JOptionPane.showMessageDialog(rootPane,"password entered is wrong","Try again!", JOptionPane.ERROR_MESSAGE);
                  oldPass.setText("");
              }  
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(passwordChange.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
            
    }//GEN-LAST:event_updateActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(passwordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(passwordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(passwordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(passwordChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new passwordChange().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField newConfPass;
    private javax.swing.JTextField newPass;
    private javax.swing.JTextField oldPass;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}