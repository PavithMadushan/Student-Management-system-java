/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author PAVITH
 */
public class DbConnection {
 
 final static String DBDRIVER="com.mysql.jdbc.Driver";
 final static String DBURL="jdbc:mysql://localhost:3306/smsdb";
 final static String PSW="";
 final static String USN="root";
    
    public static Connection getConnet (){
        
        //connection is a interface
        Connection con=null;
        
        try{
            //load driver
            Class.forName(DBDRIVER);
            
            //create connection           url  un  pws    Drivermanager is a class 
           //                                               getConnection is a static method of it
            con=DriverManager.getConnection(DBURL,USN,PSW); //("","","")
            return con;
        
        }catch(Exception ex){
            
            
            JOptionPane.showMessageDialog(null, ex);
           // System.out.println("ERROR");
            //JOptionPane.showMessageDialog(nill, daasd,asdasd, 0);
            
        
        }
        
        
        
        
        return null;
}
    
}
