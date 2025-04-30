/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Eletrodomestico;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author aluno.den
 */
public class EletrodomesticoDAO {
    private Eletrodomestico eletrodomestico = new Eletrodomestico();
    
    public boolean cadastrar(String nome, String marca, double voltagem, double preco){
        Connection conn = Conexao.conectar();
        String sql = "insert into Eletrodomestico (nome, marca, voltagem, preco) values (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setDouble(3, voltagem);
            ps.setDouble(4, preco);
            ps.executeUpdate();
            return true;
        } catch(SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
