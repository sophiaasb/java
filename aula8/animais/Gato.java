package animais;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int patas, String cor) {
        super(nome, patas); 
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void exibirSom() {
        System.out.println(getNome() + " mia: MIAU!");
    }
}