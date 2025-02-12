import java.util.Scanner;

public class DiagramaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = sc.nextInt();

        if (idade > 0 && idade < 12) {
            System.out.println("Você é criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é adolescente.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto.");
        } else if (idade >= 60 || idade > 60) {
            System.out.println("Você é idoso.");
        }
    }
}