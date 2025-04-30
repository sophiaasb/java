/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno.den
 */
public class Conexao {
    private static String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private static String usuario = "root";
    private static String senha = "";
     
    public static Connection conectar(){
        try {
            Connection conn = DriverManager.getConnection(URL, usuario, senha); 
            return conn;
        } catch(SQLException e) {
            e.getMessage();
        }
        return null;
    }

}
