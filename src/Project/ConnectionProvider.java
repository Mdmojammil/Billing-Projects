/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author MOJAMMIL
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","alam123");
            return con;
            
        } 
        catch (Exception e)
        {
            return null;
        }
    }
    
}
