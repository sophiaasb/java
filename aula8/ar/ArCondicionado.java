package ar;

class ArCondicionado {
    private String modelo;
    private String codigo;
    private String marca;
    private int btu;
    private String defeito;

    public ArCondicionado(String modelo, String codigo, String marca, int btu, String defeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public int getBtu() {
        return btu;
    }

    public String getDefeito() {
        return defeito;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " +modelo);
        System.out.println("Código: " +codigo);
        System.out.println("Marca: " +marca);
        System.out.println("BTU: " +btu);
        System.out.println("Defeito: " +defeito);
    }
}