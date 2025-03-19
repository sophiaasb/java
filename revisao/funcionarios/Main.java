package funcionarios;
public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 8000.00, "Gerente");
        Funcionario assistente = new Assistente("Júlia", 3500.00, "Assistente");

        System.out.println("Bônus de " +gerente.nome+ " (" +gerente.cargo+ "): " +gerente.calcularBonus());
        System.out.println("Bônus de " +assistente.nome+ " (" +assistente.cargo+ "): " +assistente.calcularBonus());
    }
}
