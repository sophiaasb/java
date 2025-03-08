package veiculos;

public class Carro extends Veiculos {
    private int portas;
    
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;  
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " +getMarca()+ " Modelo: " +getModelo()+ " Ano: " +getAno()+ " Quantidade de portas: " +getPortas());
    }
}
