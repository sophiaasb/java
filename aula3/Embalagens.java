package aula3;
import java.util.Scanner;

public class Embalagens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n=== MENU DE EMBALAGENS ===");
            System.out.println("1 - CAIXA DE PAPELÃO");
            System.out.println("2 - SACOLA PLÁSTICA");
            System.out.println("3 - EMBALAGEM DE VIDRO");
            System.out.println("4 - SAIR");
            System.out.print("DIGITE A OPÇÃO: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento. ");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável");
                    break;
                case 4:
                    System.out.println("Saindo.....");
                    break;
                default:
                    System.out.println("Opção inválida. ");
                    break;
            }

        }
    }
}