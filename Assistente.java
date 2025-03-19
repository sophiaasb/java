package funcionarios;
public class Assistente extends Funcionario {
    
    public Assistente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05; 
    }
}