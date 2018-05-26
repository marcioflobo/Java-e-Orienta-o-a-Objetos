
public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario("Jose", Status.ATIVO);
        Usuario u2 = new Usuario("Maria", Status.INATIVO);
        
        System.out.println("Usuario 1\nNome: "+u.getNome()+"\nStatus:"+u.getStatus().getDescricao());
        System.out.println("Usuario 2\nNome: "+u2.getNome()+"\nStatus:"+u2.getStatus().getDescricao());
    }
    
}
