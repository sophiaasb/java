import java.util.Scanner;

public class VetorAtvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        int menor = numeros[0];
        int maior = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("O menor valor é: " +menor);
        System.out.println("O maior valor é: " +maior);
        
        sc.close();
    }
}
