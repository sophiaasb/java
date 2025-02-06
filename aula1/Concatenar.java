import java.util.Scanner;

public class Concatenar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra1 = sc.next();

        System.out.print("Digite uma palavra: ");
        String palavra2 = sc.next();

        /* System.out.println("Resultado = " +x+ " metros");
        System.out.println("Resultado = %.2f metros%n", x); */

        System.out.println("A junção das palavras foram: " +palavra1+ " " +palavra2);

        sc.close();

    }
}
