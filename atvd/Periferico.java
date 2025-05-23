public class Periferico {
    private String tipo;
    private String marca;

    public Periferico(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public Periferico() {
    }

    public void conectar(){
        System.out.println("O periferico está conectando..");
    }

    public void desconectar(){
        System.out.println("O periferico está desconectado..");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
