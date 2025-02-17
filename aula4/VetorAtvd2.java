import java.util.Scanner;

public class VetorAtvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        int maior = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } 
        }
        
        System.out.println("O maior valor é: " +maior);
        
        sc.close();
    }
}