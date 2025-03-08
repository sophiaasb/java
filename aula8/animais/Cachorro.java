package animais;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas); 
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void exibirSom() {
        System.out.println(getNome() + " late: AU AU!");
    }
}