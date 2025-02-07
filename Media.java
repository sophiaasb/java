import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = sc.nextDouble();

        Double media = (nota1+nota2) / 2;

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
        
        sc.close();

    }
}
