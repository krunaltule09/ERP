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
public class newteacher extends javax.swing.JFrame {
    public newteacher() {
        initComponents();
    }
            DBConnection db=new DBConnection();
            Connection conn=db.getMysqlConnect();
            private int prn;
    newteacher(int prn){
        initComponents();
        this.prn=prn;
        prnlabel.setText(Integer.toString(prn));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yjdatetf = new javax.swing.JTextField();
        pintf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        prnlabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        contacttf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        statetf = new javax.swing.JTextField();
        spec = new javax.swing.JTextField();
        bloodtf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mdobtf = new javax.swing.JTextField();
        hqual = new javax.swing.JTextField();
        ydobtf = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ddobtf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sal = new javax.swing.JTextField();
        addrtf = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        djdatetf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        divisiontf = new javax.swing.JTextField();
        mjdatetf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 650));
        setMinimumSize(new java.awt.Dimension(780, 650));
        setPreferredSize(new java.awt.Dimension(780, 650));
        setSize(new java.awt.Dimension(780, 650));
        getContentPane().setLayout(null);

        yjdatetf.setText("YYYY");
        yjdatetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yjdatetfFocusGained(evt);
            }
        });
        getContentPane().add(yjdatetf);
        yjdatetf.setBounds(170, 450, 60, 30);
        getContentPane().add(pintf);
        pintf.setBounds(500, 360, 180, 30);

        jLabel23.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel23.setText("Address :-");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(420, 160, 71, 30);

        jLabel32.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel32.setText("Pincode :-");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(420, 360, 56, 30);
        getContentPane().add(citytf);
        citytf.setBounds(500, 270, 180, 30);
        getContentPane().add(prnlabel);
        prnlabel.setBounds(170, 70, 197, 30);

        jLabel24.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel24.setText("City :-");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(430, 270, 71, 30);
        getContentPane().add(contacttf);
        contacttf.setBounds(500, 450, 180, 30);

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel1.setText("PRN :-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 71, 30);

        jLabel25.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel25.setText("Contact No :-");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(410, 450, 72, 30);
        getContentPane().add(lname);
        lname.setBounds(170, 170, 190, 30);

        jLabel26.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel26.setText("State :-");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(430, 320, 71, 30);

        jLabel14.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel14.setText("Last Name :-");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 169, 71, 30);
        getContentPane().add(statetf);
        statetf.setBounds(500, 320, 180, 30);
        getContentPane().add(spec);
        spec.setBounds(170, 220, 190, 30);
        getContentPane().add(bloodtf);
        bloodtf.setBounds(500, 410, 57, 30);

        jLabel15.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel15.setText("Specialization :-");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 220, 89, 30);

        jLabel27.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel27.setText("Blood Group :-");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(410, 410, 79, 30);

        jLabel16.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel16.setText("Highest qualification :-");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 270, 125, 30);

        mdobtf.setText("MM");
        mdobtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mdobtfFocusGained(evt);
            }
        });
        getContentPane().add(mdobtf);
        mdobtf.setBounds(250, 320, 34, 30);
        getContentPane().add(hqual);
        hqual.setBounds(170, 270, 190, 30);

        ydobtf.setText("YYYY");
        ydobtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ydobtfFocusGained(evt);
            }
        });
        getContentPane().add(ydobtf);
        ydobtf.setBounds(170, 320, 60, 30);

        jLabel28.setText("/");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(240, 330, 4, 14);

        ddobtf.setText("DD");
        ddobtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ddobtfFocusGained(evt);
            }
        });
        getContentPane().add(ddobtf);
        ddobtf.setBounds(310, 320, 30, 30);

        jLabel17.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel17.setText("Date Of Birth :-");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 320, 82, 30);

        jLabel29.setText("/");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(300, 330, 4, 14);
        getContentPane().add(sal);
        sal.setBounds(170, 360, 190, 30);

        addrtf.setColumns(20);
        addrtf.setLineWrap(true);
        addrtf.setRows(5);
        addrtf.setToolTipText("");
        addrtf.setWrapStyleWord(true);
        addrtf.setPreferredSize(new java.awt.Dimension(180, 94));
        getContentPane().add(addrtf);
        addrtf.setBounds(500, 120, 180, 120);

        jLabel18.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel18.setText("Salary :-");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(60, 360, 46, 30);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel2.setText("ADD DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 10, 250, 47);
        getContentPane().add(subject);
        subject.setBounds(170, 490, 190, 30);

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("ADD TEACHER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 550, 364, 42);

        jLabel19.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel19.setText("Subject :-");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 490, 53, 30);

        djdatetf.setText("DD");
        djdatetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                djdatetfFocusGained(evt);
            }
        });
        getContentPane().add(djdatetf);
        djdatetf.setBounds(320, 450, 28, 30);

        jLabel20.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel20.setText("Assigned Division :- ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(40, 410, 113, 30);

        jLabel30.setText("/");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(310, 460, 4, 14);
        getContentPane().add(divisiontf);
        divisiontf.setBounds(170, 410, 50, 30);

        mjdatetf.setText("MM");
        mjdatetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mjdatetfFocusGained(evt);
            }
        });
        getContentPane().add(mjdatetf);
        mjdatetf.setBounds(260, 450, 34, 30);

        jLabel21.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel21.setText("Join Date :-");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(50, 440, 63, 30);

        jLabel31.setText("/");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(240, 460, 4, 14);
        getContentPane().add(emailtf);
        emailtf.setBounds(500, 490, 180, 30);

        jLabel22.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel22.setText("Email ID :-");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(420, 490, 55, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("First Name:-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 80, 17);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(170, 120, 191, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/background.jpg"))); // NOI18N
        jLabel4.setIconTextGap(0);
        jLabel4.setMaximumSize(new java.awt.Dimension(780, 650));
        jLabel4.setMinimumSize(new java.awt.Dimension(780, 650));
        jLabel4.setPreferredSize(new java.awt.Dimension(780, 650));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, -160, 950, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if(contacttf.getText().length()==10)
            {
                String name=lname.getText();
                String specs=spec.getText();
                String qual=hqual.getText();
                int mdob=Integer.valueOf(mdobtf.getText());
                int ddob=Integer.valueOf(ddobtf.getText());
                String dob=ydobtf.getText()+"/"+mdobtf.getText()+"/"+ddobtf.getText();
                int salary=Integer.valueOf(sal.getText());
                int div=Integer.valueOf(divisiontf.getText());
                int mjdate=Integer.valueOf(mjdatetf.getText());
                int djdate=Integer.valueOf(djdatetf.getText());
                String jdate=yjdatetf.getText()+"/"+mjdatetf.getText()+"/"+djdatetf.getText();
                String sub=subject.getText();
                String addr=addrtf.getText();
                String city=citytf.getText();
                String state=statetf.getText();
                int pin=Integer.valueOf(pintf.getText());
                String blood=bloodtf.getText();
                long contact = Integer.valueOf(contacttf.getText());
                String mail=emailtf.getText();
                if(ydobtf.getText().length()!=4 || mdob<0 && mdob>13 || ddob<0 && ddob>32 || yjdatetf.getText().length()!=4 || 0<mjdate && mjdate>13 || 0<djdate && djdate>32){
                    JOptionPane.showMessageDialog(null, "INVALID DATE!!!!!", "ERROR", 1);
                }
                else{
                    String qry1="insert into user(prn,fname,lname,password,contact,addr,city,state,pincode,dob,blood,email) values("+this.prn+",'"+fname+"','"+lname+","+"'password',"+contact+",'"+addr+"','"+city+"','"+state+"',"+pin+",'"+dob+"','"+blood+"','"+mail+"');";
                    String qry2="insert into teacher(prn,join_date,salary,spec,division,subject,highest_qual) values("+this.prn+",'"+jdate+"',"+salary+",'"+specs+"','"+div+"','"+sub+"','"+qual+"');";
         
                    Statement stmt=conn.createStatement();
                    int rows=stmt.executeUpdate(qry1);
                    int rows2= stmt.executeUpdate(qry2);
                    if(rows>0 &&rows2>0){
                        JOptionPane.showMessageDialog(rootPane,"teacher added successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            else
            JOptionPane.showMessageDialog (null, "Incorrect contact no. !!!", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException | HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog (null, e.getMessage(), "Try again", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void yjdatetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yjdatetfFocusGained
        yjdatetf.setText("");
    }//GEN-LAST:event_yjdatetfFocusGained

    private void mjdatetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mjdatetfFocusGained
        mjdatetf.setText("");
    }//GEN-LAST:event_mjdatetfFocusGained

    private void djdatetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_djdatetfFocusGained
        djdatetf.setText("");
    }//GEN-LAST:event_djdatetfFocusGained

    private void ydobtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ydobtfFocusGained
        ydobtf.setText("");
    }//GEN-LAST:event_ydobtfFocusGained

    private void mdobtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mdobtfFocusGained
        mdobtf.setText("");
    }//GEN-LAST:event_mdobtfFocusGained

    private void ddobtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ddobtfFocusGained
        ddobtf.setText("");
    }//GEN-LAST:event_ddobtfFocusGained

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

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
            java.util.logging.Logger.getLogger(newteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newteacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addrtf;
    private javax.swing.JTextField bloodtf;
    private javax.swing.JTextField citytf;
    private javax.swing.JTextField contacttf;
    private javax.swing.JTextField ddobtf;
    private javax.swing.JTextField divisiontf;
    private javax.swing.JTextField djdatetf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField hqual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mdobtf;
    private javax.swing.JTextField mjdatetf;
    private javax.swing.JTextField pintf;
    private javax.swing.JLabel prnlabel;
    private javax.swing.JTextField sal;
    private javax.swing.JTextField spec;
    private javax.swing.JTextField statetf;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField ydobtf;
    private javax.swing.JTextField yjdatetf;
    // End of variables declaration//GEN-END:variables
}
