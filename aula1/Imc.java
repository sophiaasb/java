import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        /* System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US); */

        double imc = peso/(altura*altura);
        System.out.printf("Seu IMC é: %.2f%n", +imc);

        sc.close();
    }
}
