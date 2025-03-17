package aulano10.dispositivos;

class Lampada implements Dispositivo {
    private boolean ligada;

    public Lampada() {
        this.ligada = false; 
    }

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    @Override
    public boolean estaLigada() {
        return ligada;
    }
}