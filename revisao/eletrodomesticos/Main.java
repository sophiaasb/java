package eletrodomesticos;
public class Main {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Brastemp", 150.0, 350.0);
        Microondas microondas = new Microondas("Electrolux", 800.0, 30);
    
        geladeira.ligar();
        microondas.ligar();
    }
}
    