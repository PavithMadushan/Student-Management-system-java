/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnection {
 
 final static String DBDRIVER="com.mysql.jdbc.Driver";
 final static String DBURL="jdbc:mysql://localhost:3306/smsdb";
 final static String PSW="";
 final static String USN="root";
    
    public static Connection getConnet (){
        
        Connection con=null;
        
        try{
            Class.forName(DBDRIVER);
                       
            con=DriverManager.getConnection(DBURL,USN,PSW); //("","","")
            return con;
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);  
        }
        return null;}
}
