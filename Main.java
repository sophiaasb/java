package aula9;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.println("Escolha o tipo de animal:");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                System.out.print("Escolha uma opção: ");
                int tipo = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Digite o nome do animal: ");
                String nome = scanner.nextLine();

                if (tipo == 1) {
                    animais.add(new Cachorro(nome));
                    System.out.println("Cachorro " + nome + " adicionado.");
                } else if (tipo == 2) {
                    animais.add(new Gato(nome));
                    System.out.println("Gato " + nome + " adicionado.");
                } else {
                    System.out.println("Opção inválida.");
                }
            } else if (opcao == 2) {
         
                if (animais.isEmpty()) {
                    System.out.println("Nenhum animal cadastrado.");
                } else {
                    System.out.println("Escolha um animal:");
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println((i + 1) + " - " + animais.get(i).nome);
                    }

                    System.out.print("Escolha um animal: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); 

                    if (escolha >= 1 && escolha <= animais.size()) {
                        animais.get(escolha - 1).fazerSom();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
