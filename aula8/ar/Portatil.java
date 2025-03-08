package ar;

class Portatil extends ArCondicionado {
    private String voltagem;  
    private String cor;     

    public Portatil(String modelo, String codigo, String marca, int btu, String defeito, String voltagem, String cor) {
        super(modelo, codigo, marca, btu, defeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Voltagem: " +voltagem);
        System.out.println("Cor: " +cor);
    }
}

