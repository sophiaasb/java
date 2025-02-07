import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Double idade = sc.nextDouble();

        if(idade >= 18) {
            System.out.println("Você é maior de idade. ");
        } else {
            System.out.println("Voce é menor de idade.");
        }

        sc.close();
    }
}
