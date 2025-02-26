import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa>list=new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n ===== MENU =====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.next();
                    System.out.print("Informe o telefone: ");
                    String telefone = sc.next();
                    list.add(new Pessoa(nome, telefone));
                    break;
                case 2:
                if (list.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    for (Pessoa p:list) {
                        System.out.println("\n Nome: "+p.getNome()+ "\n Telefone: "+p.getTelefone());
                    }   
                }
                break;
                case 3:
                if (list.isEmpty()) {
                    System.out.println("Lista vazia");
                } else {
                    System.out.print("Informe o indice a ser removido. ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice <list.size()) {
                        list.remove(indice);
                        System.out.println("Contato removido. ");
                    }
                }
                break; 
                case 4:
                System.out.println("\n Saindo... ");
                    break;

                default:
                System.out.println("\n Opção inválida. ");
                    break;
            }
        }

        sc.close();
    }
}
