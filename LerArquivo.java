import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    
    public static void main(String[] args) {
        try {
            //FileReader para ler o arquvio.
            FileReader leitor = new FileReader("arquivo.txt");
            //BufferedReader para melhorar a leitura
            BufferedReader BufferedReader = new BufferedReader(leitor);
            String linha;

            //while lê linha por linha até encontrar null (fim do arquivo).
            while ((linha = BufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            BufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
