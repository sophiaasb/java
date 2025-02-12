import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("\n===MENU===");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - ALTERAR");
            System.out.println("4 - REMOVER");
            System.out.println("5 - SAIR");
            System.out.println("DIGITE A OPÇÃO: ");
            opcao = sc.nextInt();
        }

        sc.close();

    }
}
