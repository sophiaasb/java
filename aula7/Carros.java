import java.util.ArrayList;
import java.util.Scanner;

public class Carros {
    private String marca;
    private String modelo;
    private String anoFabricacao;
    
    public Carros(String marca, String modelo, String anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carros> list = new ArrayList<>();
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
                    System.out.print("Informe a marca do carro: ");
                    String marca = sc.next();
                    System.out.print("Informe o modelo do carro: ");
                    String modelo = sc.next();
                    System.out.print("Informe o ano de fabricação do carro");
                    String anoFabricacao = sc.next();
                    list.add(new Carros(marca, modelo, anoFabricacao));
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        for (Carros c:list) {
                            System.out.println("\n Marca: " + c.getMarca() + "\n Modelo: " + c.getModelo() + "\n Ano de fabricação: " + c.getAnoFabricacao());
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        System.out.print("Informe o índice do carro a ser atualizado: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice < list.size()) {
                            System.out.print("Informe a nova marca do carro: ");
                            String novaMarca = sc.next();
                            System.out.print("Informe o novo modelo do carro: ");
                            String novoModelo = sc.next();
                            System.out.print("Informe o novo ano de fabricação do carro: ");
                            String novoAnoFabricacao = sc.next();

                            Carros carroAtualizado = list.get(indice);
                            carroAtualizado.marca = novaMarca;
                            carroAtualizado.modelo = novoModelo;
                            carroAtualizado.anoFabricacao = novoAnoFabricacao;
                            System.out.println("Carro atualizado com sucesso.");
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