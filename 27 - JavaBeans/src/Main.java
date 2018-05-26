
public class Main {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        
        p.setNome("Jose");
        p.setIdade(34);
        
        System.out.println("Olá! Meu nome é "+ p.getNome() + "\n tenho " +p.getIdade() + " anos de idade");
    }
    
}
