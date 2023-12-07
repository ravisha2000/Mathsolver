/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Ravisha Singhabahu
 */

//connect to the mysql database of mathsolver
public class DBconnect {
        public static Connection connect() throws ClassNotFoundException {
        
        Connection conn = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mathsolver","root","");
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            return conn;
    }

   
}
