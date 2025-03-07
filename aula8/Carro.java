package aula8;
public class Carro extends Veiculos {
    public Carro(String marca, String modelo, int ano, int qtdPortas) {
        super(marca, modelo, ano);
        this.QtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQntdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibiInfo() {
        System.out.println("Marca: "+getMarca()+" Modelo: "+getModelo()+" Ano: "+getAno()+"Quantidade de portas: "+getQtdPortas());
    }
}
