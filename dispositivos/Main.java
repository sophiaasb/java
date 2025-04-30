package aulano10.dispositivos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Dispositivo tv = new Televisao();
        Dispositivo lampada = new Lampada();

        System.out.println("Deseja ligar a televisão? ");
        String respostaTV = scanner.nextLine();
        if (respostaTV.equalsIgnoreCase("sim")) {
            tv.ligar();
        }

        System.out.println("Deseja ligar a lâmpada? ");
        String respostaLampada = scanner.nextLine();
        if (respostaLampada.equalsIgnoreCase("sim")) {
            lampada.ligar();
        }

        System.out.println("\nStatus dos dispositivos:");
        System.out.println("Televisão está ligada? " +(tv.estaLigada() ? "Sim" : "Não"));
        System.out.println("Lâmpada está ligada? " +(lampada.estaLigada() ? "Sim" : "Não"));

        System.out.println("\nDeseja desligar a televisão? ");
        String respostaDesligarTV = scanner.nextLine();
        if (respostaDesligarTV.equalsIgnoreCase("sim")) {
            tv.desligar();
        }

        System.out.println("Deseja desligar a lâmpada? ");
        String respostaDesligarLampada = scanner.nextLine();
        if (respostaDesligarLampada.equalsIgnoreCase("sim")) {
            lampada.desligar();
        }

        System.out.println("\nStatus final dos dispositivos:");
        System.out.println("Televisão está ligada? " + (tv.estaLigada() ? "Sim" : "Não"));
        System.out.println("Lâmpada está ligada? " + (lampada.estaLigada() ? "Sim" : "Não"));

        scanner.close();
    }
}