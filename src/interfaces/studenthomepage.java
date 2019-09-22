/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;
import java.sql.*;
import database.DBConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class studenthomepage extends javax.swing.JFrame {
    DBConnection db=new DBConnection();
    Connection conn=db.getMysqlConnect();
    private int prn;
    /** Creates new form homePage */
    public studenthomepage() {
        initComponents();
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
       public studenthomepage(int prn) {
        try {
            initComponents();
            this.prn=prn; 
            DefaultTableModel m= (DefaultTableModel) noticetable.getModel();
            
            m.addColumn("date");
            System.out.println(m);
            m.setRowCount(0);
            Statement stmt1=conn.createStatement();
            Statement stmt2=conn.createStatement();
            Statement stmt3=conn.createStatement();

            ResultSet rst=stmt1.executeQuery("select u.fname,u.lname,u.branch from user u,stud s where u.prn=s.prn and u.prn="+prn);
            ResultSet rstop=stmt2.executeQuery("select topic,noticedate from notices where datediff(curdate(),noticedate)<=7");
            
            label_prn.setText(Integer.toString(prn));
            System.out.println(prn);
            if(rst.next()){
                label_fname.setText(rst.getString("fname")+" "+rst.getString("lname"));
                label_branch.setText(rst.getString("branch"));
            }
            while(rstop.next()){        
                String top=rstop.getString("topic");
                String date=rstop.getDate("noticedate").toString();
                System.out.println(top+"   "+date);
                
                m.addRow(new Object [] {top,date});
            }
            

        }
 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
    public void showNotices(DefaultTableModel m){
        try {
            Statement stmt2=conn.createStatement();
            ResultSet rstop=stmt2.executeQuery("select topic,noticedate from notices;");
            
            
            while(rstop.next()){
                String top=rstop.getString("topic");
               
                Date date=rstop.getDate("noticedate");
                
                m.addRow(new Object [] {top,date});
            }
            rstop.close();
        } catch (SQLException ex) {
            Logger.getLogger(studenthomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }
    



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notice = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        noticearea = new javax.swing.JTextArea();
        attendance = new javax.swing.JButton();
        syllabus = new javax.swing.JButton();
        timetable = new javax.swing.JButton();
        payableFees = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_fname = new javax.swing.JLabel();
        label_prn = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        infoUpdate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        label_branch = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        noticetable = new javax.swing.JTable();
        shownotice = new javax.swing.JButton();
        changePass = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        notice.setTitle("Notice");
        notice.setBounds(new java.awt.Rectangle(450, 350, 420, 260));

        noticearea.setEditable(false);
        noticearea.setColumns(20);
        noticearea.setLineWrap(true);
        noticearea.setRows(5);
        noticearea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(noticearea);

        javax.swing.GroupLayout noticeLayout = new javax.swing.GroupLayout(notice.getContentPane());
        notice.getContentPane().setLayout(noticeLayout);
        noticeLayout.setHorizontalGroup(
            noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        noticeLayout.setVerticalGroup(
            noticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 600));
        setMinimumSize(new java.awt.Dimension(920, 600));
        setPreferredSize(new java.awt.Dimension(920, 600));
        getContentPane().setLayout(null);

        attendance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        attendance.setText("attendance");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });
        getContentPane().add(attendance);
        attendance.setBounds(35, 450, 119, 27);

        syllabus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        syllabus.setText("syllabus");
        syllabus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syllabusActionPerformed(evt);
            }
        });
        getContentPane().add(syllabus);
        syllabus.setBounds(175, 450, 95, 27);

        timetable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        timetable.setText("timetable");
        timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetableActionPerformed(evt);
            }
        });
        getContentPane().add(timetable);
        timetable.setBounds(288, 450, 103, 27);

        payableFees.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        payableFees.setText("Payable Fees");
        payableFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payableFeesActionPerformed(evt);
            }
        });
        getContentPane().add(payableFees);
        payableFees.setBounds(409, 450, 133, 27);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setText("PRN :-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 44, 31);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Name:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(208, 11, 50, 31);

        label_fname.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        getContentPane().add(label_fname);
        label_fname.setBounds(268, 11, 187, 31);

        label_prn.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        getContentPane().add(label_prn);
        label_prn.setBounds(60, 11, 142, 30);

        logout.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(734, 11, 67, 31);

        infoUpdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        infoUpdate.setText("update info");
        infoUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(infoUpdate);
        infoUpdate.setBounds(560, 450, 121, 27);

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Branch:-");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(461, 11, 62, 31);

        label_branch.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        getContentPane().add(label_branch);
        label_branch.setBounds(541, 11, 183, 31);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 898, 2);

        noticetable.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        noticetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOTICE"
            }
        ));
        noticetable.setOpaque(false);
        jScrollPane1.setViewportView(noticetable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(114, 111, 535, 293);

        shownotice.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        shownotice.setText("Notice Description");
        shownotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shownoticeActionPerformed(evt);
            }
        });
        getContentPane().add(shownotice);
        shownotice.setBounds(660, 370, 180, 40);

        changePass.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        changePass.setText("  Change Password");
        changePass.setOpaque(true);
        changePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassMouseClicked(evt);
            }
        });
        getContentPane().add(changePass);
        changePass.setBounds(660, 110, 140, 30);

        profile.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        profile.setText("View Profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        getContentPane().add(profile);
        profile.setBounds(699, 450, 125, 27);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/background.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 910, 570);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void syllabusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syllabusActionPerformed
        
        new syllabuscheck(this.prn).setVisible(true);
    }//GEN-LAST:event_syllabusActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
       new attendancecheck(this.prn).setVisible(true);
       
    }//GEN-LAST:event_attendanceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void infoUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoUpdateActionPerformed
          
        new updateProfile(this.prn).setVisible(true);
    }//GEN-LAST:event_infoUpdateActionPerformed

    private void shownoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shownoticeActionPerformed
        
        DefaultTableModel m= (DefaultTableModel) noticetable.getModel();

        String desc="no description";
        try {
            String top=m.getValueAt(noticetable.getSelectedRow(),0).toString();
            Statement stmt=conn.createStatement();
            System.out.println(top);
            String qry="select description from notices where topic="+"'"+top+"'";
            ResultSet rs=stmt.executeQuery(qry);
            if(rs.next()){
               desc=rs.getString("description"); 
            }
            
            JOptionPane.showMessageDialog(null,desc, "description", JOptionPane.ERROR_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(studenthomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_shownoticeActionPerformed

    private void payableFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payableFeesActionPerformed
       
        try {
            int feepaid=0;
            Statement stmt=conn.createStatement();
            String qry="select fees_paid from stud where prn="+prn+";";
            ResultSet rs=stmt.executeQuery(qry);
            if(rs.next()){
            feepaid=rs.getInt("fees_paid");
            }
            int due=260000-feepaid;
            JOptionPane.showMessageDialog(null, "Paid fees= "+feepaid+"\nDue Fees= "+due, "FEES", 3);
        } catch (SQLException ex) {
            Logger.getLogger(studenthomepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payableFeesActionPerformed

    private void timetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetableActionPerformed
            new timetable().setVisible(true);
    }//GEN-LAST:event_timetableActionPerformed

    private void changePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassMouseClicked
        new passwordChange(this.prn).setVisible(true);
    }//GEN-LAST:event_changePassMouseClicked

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        profile pro=new profile(this.prn);
        pro.setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        new studenthomepage(103217015).setVisible(true);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studenthomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendance;
    private javax.swing.JLabel changePass;
    private javax.swing.JButton infoUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_branch;
    private javax.swing.JLabel label_fname;
    private javax.swing.JLabel label_prn;
    private javax.swing.JButton logout;
    private javax.swing.JDialog notice;
    private javax.swing.JTextArea noticearea;
    private javax.swing.JTable noticetable;
    private javax.swing.JButton payableFees;
    private javax.swing.JButton profile;
    private javax.swing.JButton shownotice;
    private javax.swing.JButton syllabus;
    private javax.swing.JButton timetable;
    // End of variables declaration//GEN-END:variables

}
