package funcionarios;
public class Gerente extends Funcionario {
    double bonus;

    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
        this.bonus = salario * 0.10;
    }

    @Override
    public double calcularBonus() {
        return this.bonus;
    }
}