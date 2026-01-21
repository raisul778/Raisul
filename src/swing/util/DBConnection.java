/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hp
 */
public class DBConnection {

    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
    private static final String DB_URL = "jdbc:mysql://localhost:3306/swing"; 
    private static final String DB_USERNAME = "root"; 
    private static final String DB_PASSWORD = "root"; 
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER_CLASS);
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
}
