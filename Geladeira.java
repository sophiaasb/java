package eletrodomesticos;

public class Geladeira extends Eletrodomestico {
    private double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public void ligar() {
        System.out.println("A geladeira da marca " +marca+ " está funcionando com potência de " +potencia+ "W e capacidade de " +capacidade+ " litros.");
    }
}
