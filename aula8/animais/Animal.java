package animais;

public class Animal {
    private String nome;
    private int patas;

    public Animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public int getPatas() {
        return patas;
    }

    public void exibirSom() {
        System.out.println("O animal faz um som.");
    }
}