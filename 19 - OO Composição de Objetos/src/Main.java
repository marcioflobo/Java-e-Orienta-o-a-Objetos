
public class Main {

    
    public static void main(String[] args) {
        
        Dono d = new Dono();
        d.nome = "Jose";
        d.idade = 23;
        
        Cachorro c = new Cachorro();
        c.dono =d;
        c.idade =2;
        c.nome ="Jack";
        
        System.out.println("Olá meu nome é " + c.nome + " Sou um cão, tenho "+c.idade + " anos . \n"
                + " Meu dono se chama "+c.dono.nome + ", ele tem "+c.dono.idade+" anos ");
    }
    
}
