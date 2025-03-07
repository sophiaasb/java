package aula8;
import Gerente;

public class FuncionarioApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sophia", 800, 20);
        Gerente gerente = new Gerente("Anderson", 2000, 50, 200);

        System.out.println("Nome: "+funcionario.getNome()+ "salario: "+funcionario.getSalario());

        System.out.println("Nome: "+gerente.getNome()+ "salario: "+gerente.getSalario());
    }
}
