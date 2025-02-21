import java.util.ArrayList;

public class ArrayListString1 {
    public static void main(String args[]) { 

        ArrayList<String> nomes = new ArrayList<>(); 
        nomes.add("Anderson"); 
        nomes.add("bob"); 
        nomes.add("carol"); 

        //listando todos os objetos da lista 
        System.out.println("Primeiros nomes: " +nomes); 
        
        //acessando o elemento pelo indice 
        System.out.println(nomes.get(0)); 

        //Iteração sobre os elementos 
        for (String nome: nomes) {
            System.out.println(nome);
    }

        //Removendo elementos
        nomes.remove("bob");
        System.out.println("Após a remoção a lista é: " +nomes);
}
}