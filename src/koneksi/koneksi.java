/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


 /*/
 * @author User
 */

public class koneksi {
  
    public static Connection koneksiDb() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/buku";  // Ganti "namadatabase" dengan nama database Anda
        String user = "root";  // Ganti "username" dengan username database Anda
        String password = "";  // Ganti "password" dengan password database Anda
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


        
       }


