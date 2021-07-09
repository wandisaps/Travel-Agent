/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;

/**
 *
 * @author lenovo
 */

public class Koneksi {
    private static Connection MySQLConfig;
    
    static Connection config() throws SQLDataException {
        try {
            String url = "jdbc:mysql://localhost:3306/travel-agent";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver (new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user, pass);
            System.out.println("");
        }catch (Exception e) {
            System.out.println("Koneksi gagal"+e.getMessage());
        }
        return MySQLConfig;
    }
}
