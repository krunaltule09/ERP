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

/**
 *
 * @author mayan
 */
public class newstud extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public newstud() {
        initComponents();
    }
            DBConnection db=new DBConnection();
            Connection conn=db.getMysqlConnect();
            private int prn;
    newstud(int prn) {
        initComponents();
        this.prn=prn;
        prnlabel.setText(Integer.toString(prn)); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        label_fname = new javax.swing.JLabel();
        mnametf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fnametf = new javax.swing.JTextField();
        ydobtf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        newroll = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cattf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        divisiontf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        contacttf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        statetf = new javax.swing.JTextField();
        bloodtf = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        mdobtf = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ddobtf = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        addrtf = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dadatetf = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        madatetf = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        yadatetf = new javax.swing.JTextField();
        pintf = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        prnlabel = new javax.swing.JLabel();
        label_lname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        fees_paid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add detatils");
        setMaximumSize(new java.awt.Dimension(850, 760));
        setMinimumSize(new java.awt.Dimension(850, 760));
        setPreferredSize(new java.awt.Dimension(850, 760));
        setSize(new java.awt.Dimension(850, 760));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("PRN :-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 90, 71, 30);
        getContentPane().add(lname);
        lname.setBounds(190, 220, 190, 40);

        label_fname.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        label_fname.setText("First Name :-");
        getContentPane().add(label_fname);
        label_fname.setBounds(80, 150, 71, 30);
        getContentPane().add(mnametf);
        mnametf.setBounds(190, 290, 197, 40);

        jLabel15.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel15.setText("Mother's Name :-");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 290, 112, 30);

        jLabel16.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel16.setText("Father's Name :-");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 360, 92, 30);
        getContentPane().add(fnametf);
        fnametf.setBounds(190, 360, 197, 40);

        ydobtf.setText("YYYY");
        ydobtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ydobtfMouseClicked(evt);
            }
        });
        getContentPane().add(ydobtf);
        ydobtf.setBounds(190, 420, 70, 30);

        jLabel17.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel17.setText("Date Of Birth :-");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(70, 420, 82, 30);
        getContentPane().add(newroll);
        newroll.setBounds(190, 460, 200, 30);

        jLabel18.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel18.setText("Assigned Rollno :-");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(50, 460, 101, 30);
        getContentPane().add(cattf);
        cattf.setBounds(190, 590, 210, 30);

        jLabel19.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel19.setText("Category :-");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(80, 590, 61, 30);

        jLabel20.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel20.setText("Division :- ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(80, 500, 57, 30);
        getContentPane().add(divisiontf);
        divisiontf.setBounds(190, 500, 50, 30);

        jLabel21.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel21.setText("Addmission Date :-");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(50, 540, 106, 30);
        getContentPane().add(emailtf);
        emailtf.setBounds(590, 520, 180, 40);

        jLabel22.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel22.setText("Email ID :-");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(490, 530, 55, 30);

        jLabel23.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel23.setText("Address :-");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(480, 90, 71, 30);
        getContentPane().add(citytf);
        citytf.setBounds(590, 220, 170, 40);

        jLabel24.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel24.setText("City :-");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(490, 220, 71, 30);
        getContentPane().add(contacttf);
        contacttf.setBounds(590, 470, 170, 40);

        jLabel25.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel25.setText("Contact No :-");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(480, 480, 72, 30);

        jLabel26.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel26.setText("State :-");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(480, 290, 71, 30);
        getContentPane().add(statetf);
        statetf.setBounds(590, 290, 170, 40);
        getContentPane().add(bloodtf);
        bloodtf.setBounds(590, 410, 170, 40);

        jLabel27.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel27.setText("Blood Group :-");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(480, 420, 79, 30);

        mdobtf.setText("MM");
        mdobtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mdobtfMouseClicked(evt);
            }
        });
        getContentPane().add(mdobtf);
        mdobtf.setBounds(284, 420, 50, 30);

        jLabel28.setText("/");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(270, 430, 4, 14);

        ddobtf.setText("DD");
        ddobtf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddobtfMouseClicked(evt);
            }
        });
        getContentPane().add(ddobtf);
        ddobtf.setBounds(350, 420, 40, 30);

        jLabel29.setText("/");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(340, 430, 4, 14);

        addrtf.setColumns(20);
        addrtf.setLineWrap(true);
        addrtf.setRows(5);
        addrtf.setToolTipText("");
        addrtf.setWrapStyleWord(true);
        getContentPane().add(addrtf);
        addrtf.setBounds(590, 70, 164, 70);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel2.setText("ADD DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 20, 250, 47);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("ADD STUDENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 640, 364, 42);

        dadatetf.setText("DD");
        dadatetf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadatetfMouseClicked(evt);
            }
        });
        getContentPane().add(dadatetf);
        dadatetf.setBounds(350, 540, 40, 30);

        jLabel30.setText("/");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(330, 550, 4, 14);

        madatetf.setText("MM");
        madatetf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                madatetfMouseClicked(evt);
            }
        });
        getContentPane().add(madatetf);
        madatetf.setBounds(280, 540, 34, 30);

        jLabel31.setText("/");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(260, 550, 4, 14);

        yadatetf.setText("YYYY");
        yadatetf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yadatetfMouseClicked(evt);
            }
        });
        getContentPane().add(yadatetf);
        yadatetf.setBounds(190, 540, 60, 30);
        getContentPane().add(pintf);
        pintf.setBounds(590, 350, 170, 40);

        jLabel32.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel32.setText("Pincode :-");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(480, 360, 56, 30);

        prnlabel.setText("prn");
        getContentPane().add(prnlabel);
        prnlabel.setBounds(190, 90, 197, 30);

        label_lname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_lname.setText("last name:-");
        getContentPane().add(label_lname);
        label_lname.setBounds(80, 230, 70, 17);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(190, 150, 190, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("branch:-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 584, 60, 30);

        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch);
        branch.setBounds(590, 580, 170, 40);
        getContentPane().add(fees_paid);
        fees_paid.setBounds(590, 160, 170, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("fees_paid:-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 160, 70, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 10, 870, 710);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if(contacttf.getText().length()==10)
            {
                String fname=this.fname.getText();
                int fees_paid=Integer.parseInt(this.fees_paid.getText());
                String lname=this.lname.getText();
                String maname=mnametf.getText();
                String faname=fnametf.getText();
                String branch=this.branch.getText();
                int mdob=Integer.parseInt(mdobtf.getText());
                int ddob=Integer.parseInt(ddobtf.getText());
                String dob=ydobtf.getText()+"/"+mdobtf.getText()+"/"+ddobtf.getText();
                int roll=Integer.parseInt(newroll.getText());
                int div=Integer.parseInt(divisiontf.getText());
                int madate=Integer.parseInt(madatetf.getText());
                int dadate=Integer.parseInt(dadatetf.getText());
                String adate=yadatetf.getText()+"/"+madatetf.getText()+"/"+dadatetf.getText();
                String cat=cattf.getText();
                String addr=addrtf.getText();
                String city=citytf.getText();
                String state=statetf.getText();
                Long pin=Long.parseLong(pintf.getText());
                String blood=bloodtf.getText();
               long contact = Long.valueOf(contacttf.getText());
                System.out.println(contact);
                String mail=emailtf.getText();
                if(ydobtf.getText().length()!=4 || mdob<0 && mdob>13 || ddob<0 && ddob>32 || yadatetf.getText().length()!=4 || 0<madate && madate>13 || 0<dadate && dadate>31){
                    JOptionPane.showMessageDialog(null, "INVALID DATE!!!!!", "ERROR", 1);
                }
                else{
                    String qry1="insert into user(prn,fname,lname,branch,password,contact,addr,city,state,pincode,dob,blood) values("+this.prn+",'"+fname+"','"+lname+"','"+branch+"',"+"'password',"+contact+",'"+addr+"','"+city+"','"+state+"',"+pin+",'"+dob+"','"+blood+"');";
                    String qry2="insert into stud(rollno,prn,division,adm_date,fees_paid,category,fname,mname) values("+roll+","+this.prn+","+div+",'"+adate+"',"+fees_paid+",'"+cat+"','"+faname+"','"+maname+"');";

//                    String qry="update user set name=\""+name+"\", dob=\""+dob+"\", addr=\""+addr+"\", city=\""+city+"\", state=\""+state+
//                            "\", pincode="+pin+", contact="+contact+", email=\""+mail+"\", blood=\""+blood+"\" where prn="+prn+";";
//                    String qry1="update student set fname=\""+fname+"\", mname=\""+mname+"\", rollno="+roll+", division="+div+", adm_date=\""
//                            +adate+"\", category=\""+cat+"\" where prn="+prn+";";
                    String qry3="insert into attendance(prn,rollno) value("+this.prn+","+roll+");";
                    Statement stmt=conn.createStatement();
                    stmt.executeUpdate(qry1);
                    stmt.executeUpdate(qry2);
                    stmt.executeUpdate(qry3);

                    JOptionPane.showMessageDialog(null, "DONE !!!!!", "Success", 1);
                   
                    
                }
            }
            else
                JOptionPane.showMessageDialog (null, "Incorrect contact no. !!!", "Try again", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException | HeadlessException | NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog (null, "Incorrect Entries !!!", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ydobtfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ydobtfMouseClicked
        ydobtf.setText("");
    }//GEN-LAST:event_ydobtfMouseClicked

    private void mdobtfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdobtfMouseClicked
        mdobtf.setText("");
    }//GEN-LAST:event_mdobtfMouseClicked

    private void ddobtfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddobtfMouseClicked
        ddobtf.setText("");
    }//GEN-LAST:event_ddobtfMouseClicked

    private void yadatetfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yadatetfMouseClicked
        yadatetf.setText("");
    }//GEN-LAST:event_yadatetfMouseClicked

    private void madatetfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_madatetfMouseClicked
        madatetf.setText("");
    }//GEN-LAST:event_madatetfMouseClicked

    private void dadatetfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadatetfMouseClicked
        dadatetf.setText("");
    }//GEN-LAST:event_dadatetfMouseClicked

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed
    
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
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newstud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addrtf;
    private javax.swing.JTextField bloodtf;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField cattf;
    private javax.swing.JTextField citytf;
    private javax.swing.JTextField contacttf;
    private javax.swing.JTextField dadatetf;
    private javax.swing.JTextField ddobtf;
    private javax.swing.JTextField divisiontf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField fees_paid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fnametf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_fname;
    private javax.swing.JLabel label_lname;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField madatetf;
    private javax.swing.JTextField mdobtf;
    private javax.swing.JTextField mnametf;
    private javax.swing.JTextField newroll;
    private javax.swing.JTextField pintf;
    private javax.swing.JLabel prnlabel;
    private javax.swing.JTextField statetf;
    private javax.swing.JTextField yadatetf;
    private javax.swing.JTextField ydobtf;
    // End of variables declaration//GEN-END:variables
}