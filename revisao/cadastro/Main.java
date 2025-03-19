package cadastro;
public class Main {
    
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.90, 250);

    System.out.println("Valor total de estoque: R$ " +produto.calcularValorTotal());

        produto.setNome("Camisa Polo");
        produto.setPreco(49.90);
        produto.setQuantidade(500);

        System.out.println("Valor total de estoque após alterações: R$ " +produto.calcularValorTotal());
    }
}