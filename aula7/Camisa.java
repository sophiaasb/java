import java.util.ArrayList;
import java.util.Scanner;

public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;
    
    public Camisa(String cor, String tamanho, String tipo) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTipo() {
        return tipo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Camisa> list = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n ===== MENU =====");
            System.out.println("1 - CRIAR");
            System.out.println("2 - LER");
            System.out.println("3 - ATUALIZAR");
            System.out.println("4 - APAGAR");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a cor da camisa: ");
                    String cor = sc.next();
                    System.out.print("Informe o tamanho: ");
                    String tamanho = sc.next();
                    System.out.print("Informe o tipo: ");
                    String tipo = sc.next();
                    list.add(new Camisa(cor, tamanho, tipo));
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        for (Camisa c : list) {
                            System.out.println("\n Cor: " + c.getCor() + "\n Tamanho: " + c.getTamanho() + "\n Tipo: " + c.getTipo());
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        System.out.print("Informe o índice da camisa a ser atualizada: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice < list.size()) {
                            System.out.print("Informe a nova cor da camisa: ");
                            String novaCor = sc.next();
                            System.out.print("Informe o novo tamanho: ");
                            String novoTamanho = sc.next();
                            System.out.print("Informe o novo tipo: ");
                            String novoTipo = sc.next();

                            Camisa camisaAtualizada = list.get(indice);
                            camisaAtualizada.cor = novaCor;
                            camisaAtualizada.tamanho = novoTamanho;
                            camisaAtualizada.tipo = novoTipo;
                            System.out.println("Camisa atualizada com sucesso.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n Apagando... ");
                    break;

                default:
                    System.out.println("\n Opção inválida. ");
                    break;
            }
        }

        sc.close();
    }
}
