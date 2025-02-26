public class Pessoa { 
    private String nome; 
    private String telefone; 
    
    //CONSTRUTOR 
    public Pessoa (String nome, String telefone) { 
    this.nome = nome; 
    this.telefone = telefone; 
    } 
    //acessador 
    public String getNome() { 
    return nome; 
    } 
    //modificador 
    public void setNome (String nome) { 
    this.nome = nome; 
    }
    
    public String getTelefone() {
    return telefone;
    }
}