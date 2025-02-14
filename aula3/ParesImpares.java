package aula3;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Números ímpares de 1 a 51:");
    
        for (int i = 1; i <= 51; i += 2) {
            System.out.print(i + ", ");
        }
    
        System.out.println("\nNúmeros pares de 52 a 100:");
    
        for (int i = 52; i <= 100; i += 2) {
            System.out.print(i+ ", ");
        }

        sc.close();

        }
    }
    
