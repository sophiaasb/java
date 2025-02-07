import java.util.Scanner;
public class Salario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = sc.nextDouble();

        if(salario == 3000) {
            System.out.print("Rico.");
        } else {
            System.out.print("Pobre.");
        }

        sc.close();
    }
}