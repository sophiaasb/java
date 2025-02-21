import java.util.ArrayList; 
import java.util.Scanner; 

public class ArrayListString { 
    public static void main(String[] args) { 
    // Criando um Scanner para entrada de dados do usuário 
    Scanner scanner = new Scanner(System.in); 

    // Criando um ArrayList para armazenar as strings 
    ArrayList<String> lista = new ArrayList<>(); 

    // Solicitando ao usuário que insira uma string 
    System.out.print("Insira uma string: "); 
    String entrada = scanner.nextLine(); 

    // Adicionando a string à lista 
    lista.add(entrada); 

    // Exibindo a lista 
    System.out.println("Elementos da lista:"); 
    for (String elemento: lista) { 
    System.out.println(elemento);

    // Fechando o Scanner 
    scanner.close();    
    }    
}
}