package aula8;
public class Moto extends Veiculos { 

    public Moto (String marca, String modelo, int ano, int cilindrada) { 
        super(marca, modelo, ano); 
        this.cilindrada = cilindrada; 
    } 

    public int getCilindrada() { 
        return cilindrada;
    } 
   
    public void setCilindrada (int cilindrada) { 
        this.cilindrada = cilindrada; 
    } 

    public void exibiInfo(){ 
        System.out.println("Marca: "+getMarca()+" Modelo: " +getModelo()+" Ano: "+getAno()+"Cilindradas: "+getCilindrada()); 
    } 
}