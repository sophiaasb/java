import java.util.Scanner;

public class Diagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        Integer numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("O número é nulo.");
        } else if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        sc.close();
    }
}