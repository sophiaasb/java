package eletrodomesticos;
public class Microondas extends Eletrodomestico {
        private int tempoMaximo;
    
        public Microondas(String marca, double potencia, int tempoMaximo) {
            super(marca, potencia);
            this.tempoMaximo = tempoMaximo;
        }
    
        public void ligar() {
            System.out.println("O micro-ondas da marca " +marca+ " está funcionando com potência de " +potencia+ "W e tempo máximo de " +tempoMaximo+ " minutos.");
        }
    }
