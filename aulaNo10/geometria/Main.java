public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);
        Circulo circulo = new Circulo(4);

        System.out.println("Área do Retângulo: " +retangulo.calcularArea());
        System.out.println("Área do Círculo: " +circulo.calcularArea());
    }
}
