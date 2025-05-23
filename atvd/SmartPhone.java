public class SmartPhone implements IDispositivo{
    private int bateria;
    private String sistemaOp;



    @Override
    public void ligar(){
        System.out.println("Ligando smartphone..");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando smartphone..");
    }

    public void carregarBateria(){
        System.out.println("Carregando o smartphone");
    }

    public void instalarApp(String nomeAplicativo){
        System.out.println("Instalando "+ nomeAplicativo + "...");
    }

    public int getBateria() {
        return bateria;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

}
