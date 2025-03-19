package livros;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorLivros {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n ===== Menu de Gerenciamento de Livros ===== ");
            System.out.println("1 - Adicionar um novo livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Alterar informações de um livro");
            System.out.println("4 - Remover um livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    alterarLivro();
                    break;
                case 4:
                    removerLivro();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void adicionarLivro() {
        System.out.print("\nDigite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = sc.nextInt();

        System.out.print("Digite o preço do livro: ");
        double preco = sc.nextDouble();
        sc.nextLine();  

        Livro livro = new Livro(titulo, autor, anoPublicacao, preco);
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado.");
        } else {
            System.out.println("\nLista de Livros Cadastrados:");
            for (Livro livro : livros) {
                livro.exibirInformacoes();
                System.out.println("------------------------------");
            }
        }
    }

    private static void alterarLivro() {
        System.out.print("\nDigite o título do livro que deseja alterar: ");
        String tituloBusca = sc.nextLine();

        Livro livroEncontrado = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado!");
            livroEncontrado.exibirInformacoes();

            System.out.println("\nO que deseja alterar?");
            System.out.println("1 - Título");
            System.out.println("2 - Autor");
            System.out.println("3 - Ano de Publicação");
            System.out.println("4 - Preço");
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();
            sc.nextLine();  

            switch (escolha) {
                case 1:
                    System.out.print("Digite o novo título: ");
                    livroEncontrado.setTitulo(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Digite o novo autor: ");
                    livroEncontrado.setAutor(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Digite o novo ano de publicação: ");
                    livroEncontrado.setAnoPublicacao(sc.nextInt());
                    sc.nextLine();  
                    break;
                case 4:
                    System.out.print("Digite o novo preço: ");
                    livroEncontrado.setPreco(sc.nextDouble());
                    sc.nextLine(); 
                    break;
                default:
                    System.out.println("Opção inválida.");
            } while (escolha != 4);
            System.out.println("Informações do livro alteradas com sucesso!");
        } else {
            System.out.println("\nLivro não encontrado!");
        }
    }

    private static void removerLivro() {
        System.out.print("\nDigite o título do livro que deseja remover: ");
        String tituloBusca = sc.nextLine();

        Livro livroRemovido = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                livroRemovido = livro;
                break;
            }
        }

        if (livroRemovido != null) {
            livros.remove(livroRemovido);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("\nLivro não encontrado!");
        }

        sc.close();
    }
}
