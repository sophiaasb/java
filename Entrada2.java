import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número ");
        double n2 = sc.nextDouble();

        double soma = n1+n2;
        double sub = n1-n2;
        double multi = n1*n2;
        double div = n1/n2;
        double media = (n1+n2)/2;

        System.out.println("Soma: " +soma);
        System.out.println("Subtração: " +sub);
        System.out.println("Multiplicação: " +multi);
        System.out.println("Divisão: " +div);
        System.out.println("Média aritmética: " +media);
        sc.close();
    }
}
