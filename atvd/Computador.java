
import java.util.ArrayList;

public class Computador implements IDispositivo{
    private String cpu;
    private String ram;
    ArrayList<Periferico> perifericos = new ArrayList<>();


    @Override
    public void ligar() {
        System.out.println("O computador está ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("O computador está desligando...");
    }

    public void adicionarPeriferico(String tipo, String marca){
        Periferico periferico = new Periferico(marca, tipo);

        perifericos.add(periferico);
        System.out.println("Periferico adicionado com sucesso!");

    }

    public void removerPeriferico(String tipo){
        
        Periferico tPeriferico = new Periferico();

        for (Periferico p : perifericos) {

            if (p.getTipo().equals(tipo)) {
                tPeriferico = p;
            }

        }

        if(perifericos.remove(tPeriferico)){
            System.out.println("periferico removido com sucesso!");
            return;
        }
        System.out.println("Não foi possivel remover o periferico!");

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }


}
