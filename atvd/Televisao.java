public class Televisao implements IDispositivo {
    private int canalAtual;
    private int volume;

    @Override 
    public void ligar() {
        System.out.println("A televisão está ligada!");
    }
    @Override
    public void desligar() {
        System.out.println("A televisão está desligada!");
    }
    public void mudarCanal(int novoCanal) {
        this.canalAtual = novoCanal;
        System.out.println("O canal foi alterado!");
    }
    public void ajustarVolume(int novoVolume) {
        if (this.volume > novoVolume) {
            System.out.println("O volume foi diminuido.");
        } else {
            System.out.println("O volume foi aumentado.");
        }
        this.volume = novoVolume;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public int getVolume() {
        return volume;
    }

}
