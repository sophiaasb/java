package aulano10;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");

        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Você digitou o número: " +numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Digite um número inteiro válido.");
        } finally {
            sc.close();
        }
    }
}
