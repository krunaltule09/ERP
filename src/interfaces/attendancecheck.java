/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import database.DBConnection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayan
 */
public class attendancecheck extends javax.swing.JFrame {

    /**
     * Creates new form attendancecheck
     */
    DBConnection db=new DBConnection();
    Connection conn=db.getMysqlConnect();
    public attendancecheck() {
        initComponents();
    }
    private int prn;
    public attendancecheck(int prn){
        initComponents();
        Double tcn,pcn,tdbms,pdbms,ttoc,ptoc,tsmd,psmd,tot,top;
        try {
            this.prn=prn;
            int div=0;
            label_prn.setText(Integer.toString(prn));
            System.out.println(prn);
            Statement stmt=conn.createStatement();
            String brqry="select branch from user where prn="+prn;
            ResultSet brs=stmt.executeQuery(brqry);
            if(brs.next()){
                label_branch.setText(brs.getString("branch"));
            }
            String qry="select division from stud where prn="+prn;
            ResultSet rs=stmt.executeQuery(qry);
            if(rs.next()){
                div=rs.getInt("division");
            }
            rs.close();
            String qry1="select * from lectures where division="+div;
            ResultSet rs1=stmt.executeQuery(qry1);
            int tcntot=0,pcntot=0,ttoctot=0,ptoctot=0,tdbmstot=0,pdbmstot=0,tsmdtot=0,psmdtot=0;
            if(rs1.next()){
                tcntot=rs1.getInt("tcn");
                pcntot=rs1.getInt("pcn");
                tdbmstot=rs1.getInt("tdbms");
                pdbmstot=rs1.getInt("pdbms");
                tsmdtot=rs1.getInt("tsmd");
                psmdtot=rs1.getInt("psmd");
                ttoctot=rs1.getInt("ttoc");
                ptoctot=rs1.getInt("ptoc"); 
                System.out.println(pcntot);
            }
            rs1.close();
            String qry2="select * from attendance where prn="+prn;
            ResultSet rs2=stmt.executeQuery(qry2);
            int cnt=0,cnp=0,toct=0,tocp=0,dbmst=0,dbmsp=0,smdt=0,smdp=0;
            if(rs2.next()){
                cnt=rs2.getInt("tcn");
                cnp=rs2.getInt("pcn");
                dbmst=rs2.getInt("tdbms");
                dbmsp=rs2.getInt("pdbms");
                smdt=rs2.getInt("tsmd");
                smdp=rs2.getInt("psmd");
                toct=rs2.getInt("ttoc");
                tocp=rs2.getInt("ptoc");                
            }
            rs2.close();
            tcn= new Double(Float.toString(((float)cnp/pcntot)*100));
            pcn= new Double(Float.toString(((float)cnp/pcntot)*100));
            ttoc=new Double(Float.toString(((float)toct/ttoctot)*100));
            ptoc=new Double(Float.toString(((float)tocp/ptoctot)*100));
            tsmd=new Double(Float.toString(((float)smdt/tsmdtot)*100));
            psmd=new Double(Float.toString(((float)smdp/psmdtot)*100));
            tdbms=new Double(Float.toString(((float)dbmst/tdbmstot)*100));
            pdbms=new Double(Float.toString(((float)dbmsp/pdbmstot)*100));
            tot=new Double(Float.toString((float)(cnt+dbmst+smdt+toct)/(tcntot+tdbmstot+tsmdtot+ttoctot)*100));
            top=new Double(Float.toString((float)(cnp+dbmsp+smdp+tocp)/(pcntot+pdbmstot+psmdtot+ptoctot)*100));
            
            Double rtcn = BigDecimal.valueOf(tcn).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rpcn = BigDecimal.valueOf(pcn).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rttoc = BigDecimal.valueOf(ttoc).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rptoc = BigDecimal.valueOf(ptoc).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rtsmd = BigDecimal.valueOf(tsmd).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rpsmd = BigDecimal.valueOf(psmd).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rtdbms = BigDecimal.valueOf(tdbms).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double rpdbms= BigDecimal.valueOf(pdbms).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double r_th=BigDecimal.valueOf(top).setScale(2, RoundingMode.HALF_UP).doubleValue();
            Double r_p=BigDecimal.valueOf(top).setScale(2, RoundingMode.HALF_UP).doubleValue();
            
            this.tcn.setText(String.valueOf(rtcn)+"%");
            
            this.pcn.setText(String.valueOf(rpcn)+"%");
            this.tdbms.setText(String.valueOf(rtdbms)+"%");
            this.pdbms.setText(String.valueOf(rpdbms)+"%");
            this.tsmd.setText(String.valueOf(rtsmd)+"%");
            this.psmd.setText(String.valueOf(rpsmd)+"%");
            this.ttoc.setText(String.valueOf(rttoc)+"%");
            this.ptoc.setText(String.valueOf(rptoc)+"%");
            ttot.setText(String.valueOf(r_th)+"%");
            ptot.setText(String.valueOf(r_p)+"%");
        } catch (SQLException ex) {
            Logger.getLogger(attendancecheck.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        label_prn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        label_branch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ptoc = new javax.swing.JLabel();
        ttoc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pdbms = new javax.swing.JLabel();
        tdbms = new javax.swing.JLabel();
        psmd = new javax.swing.JLabel();
        tsmd = new javax.swing.JLabel();
        tcn = new javax.swing.JLabel();
        pcn = new javax.swing.JLabel();
        ptot = new javax.swing.JLabel();
        ttot = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 540));
        setMinimumSize(new java.awt.Dimension(700, 540));
        setPreferredSize(new java.awt.Dimension(700, 540));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 48, 699, 2);

        label_prn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(label_prn);
        label_prn.setBounds(60, 12, 142, 30);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("Branch:-");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 10, 62, 31);

        label_branch.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(label_branch);
        label_branch.setBounds(320, 10, 330, 31);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("PRN :-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 44, 31);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("TOC");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 100, 62, 23);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("SMD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 230, 62, 23);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("DBMS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 62, 23);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 350, 62, 23);

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("CN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 290, 62, 23);

        ptoc.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(ptoc);
        ptoc.setBounds(400, 100, 100, 23);

        ttoc.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(ttoc);
        ttoc.setBounds(210, 100, 90, 23);

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Theory");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 68, 62, 23);

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Practical");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(401, 68, 62, 23);

        pdbms.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(pdbms);
        pdbms.setBounds(400, 160, 110, 23);

        tdbms.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(tdbms);
        tdbms.setBounds(210, 160, 90, 23);

        psmd.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(psmd);
        psmd.setBounds(400, 230, 90, 23);

        tsmd.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(tsmd);
        tsmd.setBounds(210, 230, 90, 23);

        tcn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(tcn);
        tcn.setBounds(210, 290, 100, 23);

        pcn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(pcn);
        pcn.setBounds(400, 290, 100, 23);

        ptot.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(ptot);
        ptot.setBounds(400, 350, 110, 23);

        ttot.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(ttot);
        ttot.setBounds(210, 350, 110, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/b1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -160, 920, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(attendancecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendancecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendancecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendancecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendancecheck(103217014).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_branch;
    private javax.swing.JLabel label_prn;
    private javax.swing.JLabel pcn;
    private javax.swing.JLabel pdbms;
    private javax.swing.JLabel psmd;
    private javax.swing.JLabel ptoc;
    private javax.swing.JLabel ptot;
    private javax.swing.JLabel tcn;
    private javax.swing.JLabel tdbms;
    private javax.swing.JLabel tsmd;
    private javax.swing.JLabel ttoc;
    private javax.swing.JLabel ttot;
    // End of variables declaration//GEN-END:variables
}
