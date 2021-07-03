/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class konfig {

    public static Connection MySQLCOnfig;

    public konfig() {
        hubung();
    }

    public static Connection getConnection() throws SQLException {
        MySQLCOnfig = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/travel-agent", "root", "");
        return MySQLCOnfig;
    }

    public static void hubung() {
        try {
            getConnection();
            System.out.println("Koneksi Berhasil");

        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal");
        }
    }

}
