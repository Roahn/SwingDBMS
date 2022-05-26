/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Project;
import static java.lang.Class.forName;
import java.sql.*;

/**
 *
 * @author Rohan
 */
public class ConnectionProvider {
    
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
            System.out.println("Connection Successful");
            return con;
        }
        catch(Exception e ){
            System.out.println(e);
            return null;
        }
        
        
    }
    
}
