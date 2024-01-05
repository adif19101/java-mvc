/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class KoneksiDatabase {
    private static Connection conn;
    
    private static Properties propert = new Properties();
    
    public static Connection getKoneksi() throws SQLException{
        if (conn == null) {
            try {
                propert.load(new FileInputStream("C:\\Users\\mhria\\Documents\\NetBeansProjects\\java_mvc_unsika\\src\\nani\\awalia\\db\\konfigurasiDatabase.properties"));
                
            } catch (Exception e) {
                System.err.println("error mengambil file" + e);
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_pos","root","");
        }
        return conn;
        
    }
    
    public static void main(String[] args) throws SQLException {
        if(getKoneksi().equals(conn)){
            System.out.println("sukses Koneksi");
        }
    }
}
