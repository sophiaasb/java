import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da força: ");
        double forca = sc.nextDouble();

        System.out.print("Digite o valor da distância: ");
        double distancia = sc.nextDouble();

        double trabalho = forca*distancia;

        System.out.print("O resultado é: " +trabalho);
        sc.close();
    }
}