/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.DBConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;
/**
 *
 * @author mayan
 */
public class attendanceupdate extends javax.swing.JFrame {

    /**
     * Creates new form admin1
     */
    public attendanceupdate() {
        initComponents();
    }
        DBConnection db=new DBConnection();
        Connection conn=db.getMysqlConnect();
        private int prn;
        private int division;
        private String subject;
    public attendanceupdate(int prn) {
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

        classtype = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        stutbl = new javax.swing.JTable();
        display = new javax.swing.JButton();
        updateatt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pr_rb = new javax.swing.JRadioButton();
        th_rb = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));
        getContentPane().setLayout(null);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setOpaque(false);

        stutbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRN", "Roll no", "Name", "Present..??"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        stutbl.setToolTipText("");
        stutbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        stutbl.setColumnSelectionAllowed(true);
        stutbl.setName(""); // NOI18N
        stutbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(stutbl);
        stutbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        stutbl.getColumnModel().getColumn(0).setPreferredWidth(20);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(25, 108, 714, 350);

        display.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        display.setText("Display");
        display.setEnabled(false);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display);
        display.setBounds(450, 40, 110, 30);

        updateatt.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        updateatt.setText("Update Attendance");
        updateatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateattActionPerformed(evt);
            }
        });
        getContentPane().add(updateatt);
        updateatt.setBounds(580, 40, 160, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        classtype.add(pr_rb);
        pr_rb.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        pr_rb.setText("Practical");
        pr_rb.setOpaque(false);
        pr_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pr_rbActionPerformed(evt);
            }
        });

        classtype.add(th_rb);
        th_rb.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        th_rb.setText("Theory");
        th_rb.setOpaque(false);
        th_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th_rbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Class Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(th_rb)
                        .addGap(54, 54, 54)
                        .addComponent(pr_rb)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(th_rb)
                    .addComponent(pr_rb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(96, 2, 340, 80);
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 90, 773, 12);

        back.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(700, 0, 70, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/back.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        DefaultTableModel model= (DefaultTableModel) stutbl.getModel();
        String qry2;
        try {
            model.setRowCount(0);
//            int division=divselect.getSelectedIndex();
            Statement stmt=conn.createStatement();
            qry2="select division,subject from teacher where prn="+this.prn+";";
            ResultSet rst=stmt.executeQuery(qry2);
            if(rst.next()){
                this.subject=rst.getString("subject");
                System.out.println(subject);
                
                this.division=rst.getInt("division");
                System.out.println(division);
            }
            Statement stmt1=conn.createStatement();
            String qry="select u.prn, s.rollno, u.fname,u.lname from user u, stud s where s.prn=u.prn and s.division="+this.division+" order by s.rollno;";
            ResultSet rs1=stmt1.executeQuery(qry);
            while(rs1.next()){
                int pr=rs1.getInt("prn");
                int roll=rs1.getInt("rollno");
                String name=rs1.getString("fname")+" "+rs1.getString("lname");
                model.addRow(new Object [] {pr, roll, name});
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(attendanceupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_displayActionPerformed

    private void updateattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateattActionPerformed
        try {
            
            int row=stutbl.getRowCount();
            System.out.println(row);
            String qry,qry1,qry2,sub="",ctype="";
            int sub_in,sprn;
            
                    

        

            Statement stmt2=conn.createStatement();
            if(th_rb.isSelected() || pr_rb.isSelected()){
                if(th_rb.isSelected()){
                    ctype="t";
                    System.out.println("THEORY");
                }
                else if(pr_rb.isSelected()){
                    ctype="p";
                    System.out.println("PRACTICAL");
                }
//                sub_in=subselect.getSelectedIndex();
//                System.out.println(sub_in);
//                switch(subject){
//                    case 1: {
//                        sub="toc";
//                        break;
//                    }
//                    case 2: {
//                        sub="cn";
//                        break;
//                    }       
//                    case 3: {
//                        sub="dbms";
//                        break;
//                    }
//                    case 4: {
//                        sub="smd";
//                        break;
//                    }
//                    default: JOptionPane.showMessageDialog(null, "Select Subject !!!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
//                }
//                int division=divselect.getSelectedIndex();
//                System.out.println(division);
                int rowsAffected=0;
                for(int i=0;i<row;i++){
                    System.out.println("in for loop");
                    Object present=stutbl.getValueAt(i,3);
                    System.out.println("before conversion="+ present);        
                    Object a=stutbl.getValueAt(i,0);
                    sprn=(int) a;
//                    boolean present= Boolean.valueOf(p.toString());
                    System.out.println("after conversion="+present);
                    System.out.println(present);
                    if(Boolean.TRUE.equals(present)){
                        qry="update attendance set "+ctype+this.subject+"="+ctype+this.subject+"+1 where prn="+sprn+";";
                        System.out.println(qry);
                        qry1="update lectures set "+ctype+this.subject+"="+ctype+this.subject+"+1 where division="+this.division+";";
                        rowsAffected=stmt2.executeUpdate(qry1);
                        stmt2.executeUpdate(qry);
                    }
                }
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(rootPane, "attendance added successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Select Class Type !!!!!", "ERROR", 1);   
        }
        catch (SQLException | HeadlessException e) {
            e.printStackTrace();
            Logger.getLogger(attendanceupdate.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_updateattActionPerformed

    private void th_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th_rbActionPerformed
            
                display.setEnabled(true);
                DefaultTableModel model= (DefaultTableModel) stutbl.getModel();
                model.setRowCount(0);
        
      
    }//GEN-LAST:event_th_rbActionPerformed

    private void pr_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pr_rbActionPerformed

                display.setEnabled(true);
                DefaultTableModel model= (DefaultTableModel) stutbl.getModel();
                model.setRowCount(0);
         

    }//GEN-LAST:event_pr_rbActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new teacher(this.prn).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//                    new attendanceupdate(1035170113).setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup classtype;
    private javax.swing.JButton display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton pr_rb;
    private javax.swing.JTable stutbl;
    private javax.swing.JRadioButton th_rb;
    private javax.swing.JButton updateatt;
    // End of variables declaration//GEN-END:variables
}
