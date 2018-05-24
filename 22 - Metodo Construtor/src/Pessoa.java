
public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    void apresentarse(){
        System.out.println("Ola meu nome é :" + nome);
        System.out.println("Tenho "+idade + " Anos");
    }
    

    
    
}
