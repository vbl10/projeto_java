/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author sp300lab
 */
public class ConexaoMySQL {
    static String url = "jdbc:mysql://db4free.net:3306";
    static String usuario = "projeto_java";
    static String senha = "senhadobanco";
    static Connection conectarBanco() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}
