import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAgendaTelefonica {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(); 
        ArrayList<String> numeros = new ArrayList<>(); 

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){

        System.out.print("Digite o nome do contato: ");
        String nome = sc.next();
        nomes.add(nome);

        System.out.print("Digite o número do contato: ");
        String numero = sc.next();
        numeros.add(numero);
        }
        
        System.out.println("=========================================================\n");
        for(int i = 0; i < 6; i++) {
            System.out.println("Contato = " +nomes.get(i)+ " | Número: " + numeros.get(i));
        }

        sc.close();
    }
}