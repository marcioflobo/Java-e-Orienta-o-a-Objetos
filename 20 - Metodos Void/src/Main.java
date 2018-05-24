
public class Main {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.nome = "Jack";
        c.idade = 4;

        System.out.println("Método  sem retorno e sem paramentros : ");
        c.latir();

        System.out.println("Método  sem retorno e com paramentro");
        c.latir("Billy");

    }
}
