package aulano10.dispositivos;
class Televisao implements Dispositivo {
    private boolean ligada;

    public Televisao() {
        this.ligada = false; 
    }

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("A televisão foi ligada.");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("A televisão foi desligada.");
    }

    @Override
    public boolean estaLigada() {
        return ligada;
    }
}