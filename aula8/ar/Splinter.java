package ar;

class Splinter extends ArCondicionado {
    private String tipo;  
    private String tamanho;

    public Splinter(String modelo, String codigo, String marca, int btu, String defeito, String tipo, String tamanho) {
        super(modelo, codigo, marca, btu, defeito);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: " +tipo);
        System.out.println("Tamanho: " +tamanho);
    }
}
