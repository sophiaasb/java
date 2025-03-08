package ar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroArCondicionado cadastro = new CadastroArCondicionado();

        while (true) {
            System.out.println("\n=== Sistema de Cadastro de Ar Condicionado ===");
            System.out.println("1. Cadastrar Ar Condicionado");
            System.out.println("2. Gerar Relatório");
            System.out.println("3. Fechar Programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            if (opcao == 1) {
                System.out.print("Informe o modelo (Splinter ou Portátil): ");
                String modelo = scanner.nextLine();

                System.out.print("Informe o código: ");
                String codigo = scanner.nextLine();

                System.out.print("Informe a marca: ");
                String marca = scanner.nextLine();

                System.out.print("Informe o BTU: ");
                int btu = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Informe o defeito (ou deixe em branco caso não haja): ");
                String defeito = scanner.nextLine();

                if (modelo.equalsIgnoreCase("Splinter")) {
                    System.out.print("Informe o tipo (ex: Tamanho): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Informe o tamanho: ");
                    String tamanho = scanner.nextLine();

                    Splinter splinter = new Splinter(modelo, codigo, marca, btu, defeito, tipo, tamanho);
                    cadastro.cadastrarArCondicionado(splinter);

                } else if (modelo.equalsIgnoreCase("Portátil")) {
                    System.out.print("Informe a voltagem: ");
                    String voltagem = scanner.nextLine();

                    System.out.print("Informe a cor: ");
                    String cor = scanner.nextLine();

                    Portatil portatil = new Portatil(modelo, codigo, marca, btu, defeito, voltagem, cor);
                    cadastro.cadastrarArCondicionado(portatil);
                } else {
                    System.out.println("Modelo inválido. Tente novamente.");
                }

            } else if (opcao == 2) {
                cadastro.gerarRelatorio();

            } else if (opcao == 3) {
                System.out.println("Programa encerrado.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
