import java.util.Scanner;

public class Entrada6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);
        System.out.print("Seu IMC é: "+imc);

        sc.close();
    }
}
