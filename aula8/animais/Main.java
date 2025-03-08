package animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Scooby-Doo", 4, "Dogue Alemão");
        Gato gato = new Gato("John", 4, "Preto");

        cachorro.exibirSom();
        gato.exibirSom();
    }
}
