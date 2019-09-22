/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
/**
 *
 * @author admin
 */
import java.sql.*;


public class DBConnection{
    
    Connection conn=null;
    public Connection getMysqlConnect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","Krunal@203363");
            System.out.println("Connection Successfull!!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
}
    
    
    public void Display(){
        try {
            String user="",pass="";
            Statement stmt=conn.createStatement();
            ResultSet rst=stmt.executeQuery("select * from user");
            while(rst.next()){
                user=rst.getString("prn");
                pass=rst.getString("password");
                System.out.println("Successfully logged in");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
}

    

}
