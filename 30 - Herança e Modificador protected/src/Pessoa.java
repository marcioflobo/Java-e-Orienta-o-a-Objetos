
public class Pessoa {
    
    protected String nome;
    protected int idade;

    
    void apresentarse(){
        System.out.println("Olá, meu nome é "+this.getNome()+", tenho "+this.getIdade()+" anos");
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
