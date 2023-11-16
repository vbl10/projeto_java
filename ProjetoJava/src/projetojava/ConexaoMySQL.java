/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author sp300lab
 */
public class ConexaoMySQL {
    static String url = "jdbc:mysql://db4free.net:3306";
    static void realizarInsert(String sql) throws SQLException {
        Connection conn = DriverManager.getConnection(url, "projeto_java", "senhadobanco");
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
        conn.close();
    }
}
