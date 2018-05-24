
public class Cachorro {

    String nome;
    int idade;
    
    void latir(){
        System.out.println("Au au..");
    }
    
    // Sobrecarga de método com parâmetro
    void latir(String nome){
        System.out.println("Au au.. Meu nome é "+ nome);
    }
    
    //Metodo sobrecarregado com retorno
    String latirRetorno(){
        
        return "Au Au";
    }
    
}
