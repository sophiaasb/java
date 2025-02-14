import java.util.Scanner;

public class VetorAtvd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        int media = soma / numeros.length;

        System.out.println("A média dos elemtos do array é = " + media);
        sc.close();
    }
}
