package aula3;
import java.util.Scanner;

public class MenuEmbalagens {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int opcao = 0;

    do {
        System.out.println("Escolha uma opção de embalagem:");
        System.out.println("1 - Caixa de papelão");
        System.out.println("2 - Sacola plástica");
        System.out.println("3 - Embalagem de vidro");
        System.out.println("4 - Sair");
        System.out.print("Digite a opção: ");
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
            
        } while(opcao != 4);

        sc.close(); 
    }
    }
