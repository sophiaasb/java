import java.util.Scanner;

public class VetorAtvd4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAMANHO_ARRAY = 5;
        int[] numeros = new int[TAMANHO_ARRAY];
        int quantidadeNumeros = 0; 
        int opcao = 0;
        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar número ");
            System.out.println("2 - Exibir números ");
            System.out.println("3 - Remover número ");
            System.out.println("4 - Finalizar ");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1: 
                    if (quantidadeNumeros < TAMANHO_ARRAY) {
                        System.out.print("\nDigite o número a ser adicionado: ");
                        int numero = sc.nextInt();
                        numeros[quantidadeNumeros] = numero;
                        quantidadeNumeros++;
                        System.out.println("Número adicionado com sucesso.");
                    } else {
                        System.out.println("Não é possível adicionar mais números.");
                    }
                    break;

                case 2: 
                    if (quantidadeNumeros == 0) {
                        System.out.println("\nNão há números cadastrados.");
                    } else {
                        System.out.println("\nNúmeros armazenados: ");
                        for (int i = 0; i < quantidadeNumeros; i++) {
                            System.out.println("N" +i+ ": " +numeros[i]);
                        }
                    }
                    break;

                case 3: 
                    if (quantidadeNumeros == 0) {
                        System.out.println("\nNão há números para remover.");
                    } else {
                        System.out.print("\nDigite o índice do número a ser removido: ");
                        int indice = sc.nextInt();
                        
                        if (indice >= 0 && indice < quantidadeNumeros) {
                            for (int i = indice; i < quantidadeNumeros - 1; i++) {
                                numeros[i] = numeros[i+1];
                            }
                            quantidadeNumeros--;
                            System.out.println("\nNúmero removido com sucesso.");
                        } else {
                            System.out.println("\nÍndice inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nPrograma finalizado.");
                    sc.close();
                    return;

                default:
                    System.out.println("\nOpção inválida. ");
            }
        }
    }
}
