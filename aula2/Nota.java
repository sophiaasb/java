import java.util.Scanner;

public class Nota {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        Double nota = sc.nextDouble();

        if(nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}