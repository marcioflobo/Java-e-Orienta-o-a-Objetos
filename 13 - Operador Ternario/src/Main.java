
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int idade = in.nextInt();
       String s = (idade >=18) ? "Adulto" : (idade <= 12 ? "Criança" : "Adolescente");
       
        System.out.println(s);
    }
    
}
