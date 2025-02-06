import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double media = (n1+n2)/2;

        System.out.println("Média aritmética: " +media);

        sc.close();
    }
}
