public class PessoaApp { 
    public static void main(String[] args) { 

    Pessoa p1 = new Pessoa ("Sophia", "55555"); 
    System.out.println("Nome: "+p1.getNome()+ "\n telefone: "+ p1.getTelefone()); 
    p1.setNome ( "Angelina"); 

    System.out.println("O novo nome é "+p1.getNome()+ "\n telefone: "+ p1.getTelefone()); 
  
    Pessoa p2 = new Pessoa ("Júlia", "33333"); 

    System.out.println("Nome: "+p2.getNome()+ "\n telefone: "+ p2.getTelefone()); 
   } 
}