import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroProduto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter escritor = new FileWriter("produtos.txt", true);

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            escritor.write(nome + " - R$ " + preco + "\n");
            escritor.close();

            System.out.println("Produto cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o produto.");
            e.printStackTrace();
        } finally {
              scanner.close();
        }
    }
}
