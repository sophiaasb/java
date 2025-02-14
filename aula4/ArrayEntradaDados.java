import java.util.Scanner;

public class ArrayEntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos nomes deseja inserir? ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[tamanho];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes digitados: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição: " +i+ ": " +nomes[i]);
        }

        scanner.close();
    }
}
