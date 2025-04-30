/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.EletrodomesticoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class EletrodomesticoControle {
    private EletrodomesticoDAO dao = new EletrodomesticoDAO();

    public void cadastrar(String nome, String marca, double voltagem, double preco){
        if(dao.cadastrar(nome, marca, voltagem, preco)){
            JOptionPane.showMessageDialog(null, "Cadastro concluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro não concluído. Preencha corretamente os dados.");
        }
    }
    
}
