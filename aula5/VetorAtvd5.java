import java.util.Scanner;

public class VetorAtvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        boolean pares = true;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                pares = false;
                break;
            } 
        }
        
        if (pares) {
            System.out.println("Todos os elementos são pares.");
        } else {
            System.out.println("Nem todos os elementos são pares.");
        }

        sc.close();
    }
}
