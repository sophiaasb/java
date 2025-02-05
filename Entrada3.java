import java.util.Scanner;

public class Entrada3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número ");
        double n2 = sc.nextDouble();

        System.out.println("Digite o terceiro número ");
        double n3 = sc.nextDouble();

        double media = (n1+n2+n3)/2;

        System.out.println("Média aritmética: " +media);
        sc.close();
    }
}
