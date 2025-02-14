package aula3;
import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo do programa...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("Resultado da divisão: " + (num1/num2));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (true);

        sc.close();
    }
}
