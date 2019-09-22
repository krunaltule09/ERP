/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author admin
 */


import com.mysql.cj.protocol.Resultset;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class updateSal extends javax.swing.JFrame {

    /**
     * Creates new form updateSal
     */
    
DBConnection db=new DBConnection();
Connection conn=db.getMysqlConnect();  
    public updateSal() {
        initComponents();
        name.setVisible(false);
        name_label.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        prn_in = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldSal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newSal = new javax.swing.JTextField();
        updatesal = new javax.swing.JButton();
        dispSal = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        prn_in.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        prn_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prn_inMouseClicked(evt);
            }
        });
        getContentPane().add(prn_in);
        prn_in.setBounds(147, 60, 175, 34);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("enter prn:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(47, 69, 70, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setText("old salary:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 70, 20);

        oldSal.setEditable(false);
        oldSal.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(oldSal);
        oldSal.setBounds(147, 125, 177, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setText("enter new salary:-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 110, 20);

        newSal.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(newSal);
        newSal.setBounds(147, 194, 177, 40);

        updatesal.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        updatesal.setText("update");
        updatesal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesalActionPerformed(evt);
            }
        });
        getContentPane().add(updatesal);
        updatesal.setBounds(80, 255, 100, 31);

        dispSal.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        dispSal.setText("display salary");
        dispSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispSalActionPerformed(evt);
            }
        });
        getContentPane().add(dispSal);
        dispSal.setBounds(211, 255, 140, 30);

        name_label.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        name_label.setText("name:-");
        getContentPane().add(name_label);
        name_label.setBounds(54, 20, 50, 20);

        name.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(name);
        name.setBounds(147, 17, 175, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/back2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prn_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prn_inMouseClicked
        prn_in.setText("");
    }//GEN-LAST:event_prn_inMouseClicked

    private void dispSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispSalActionPerformed
    try {
        Statement stmt=conn.createStatement();
        String qry="select salary from teacher where prn="+Integer.valueOf(prn_in.getText())+";";
        ResultSet rs=stmt.executeQuery(qry);
        if(rs.next()){
            oldSal.setText(rs.getString("salary"));
        }
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(rootPane,"ERROR","try again",JOptionPane.ERROR_MESSAGE );
    }
    catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane,"enter valid prn or salary","try again",JOptionPane.WARNING_MESSAGE );

    }
    }//GEN-LAST:event_dispSalActionPerformed

    private void updatesalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesalActionPerformed
    try {
        int prn=Integer.valueOf(prn_in.getText());
        int newSalary=Integer.valueOf(newSal.getText());
        String qry="update teacher set salary="+newSalary+" where prn="+prn+";";
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(qry);
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(rootPane,"ERROR","try again",JOptionPane.ERROR_MESSAGE );

    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(rootPane,"enter valid prn or salary","try again",JOptionPane.WARNING_MESSAGE );
        
    }
    }//GEN-LAST:event_updatesalActionPerformed

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
//            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new updateSal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dispSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField newSal;
    private javax.swing.JTextField oldSal;
    private javax.swing.JTextField prn_in;
    private javax.swing.JButton updatesal;
    // End of variables declaration//GEN-END:variables
}