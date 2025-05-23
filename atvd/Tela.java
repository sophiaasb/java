public class Tela implements IDispositivo {
    private int resolucao;
    private int tamanho;
    private int brilho;

    @Override
    public void ligar() {
        System.out.println("A tela está ligada!");
    }
    @Override
    public void desligar() {
        System.out.println("A tela está desligada!");
    }

    public void ajustarBrilho(int novoBrilho) {
        if (novoBrilho > this.brilho) {
            System.out.println("O brilho foi aumentado.");
        } else {
            System.out.println("O brilho foi diminuido.");
        }
        this.brilho = novoBrilho;
    }
    public void ajustarResolucao(int novaResolucao) {
        if(novaResolucao > this.resolucao) {
            System.out.println("A resolução foi aumentada.");
        } else {
            System.out.println("A resolução foi diminuida.");
        }
        this.resolucao = novaResolucao;
    }
    public void ajustarTamanho (int novoTamanho) {
        if (novoTamanho > this.tamanho) {
            System.out.println("O tamanho foi aumentado.");
        } else {
            System.out.println("O tamanho foi diminuido.");
        }
        this.tamanho = novoTamanho;
    }
}
