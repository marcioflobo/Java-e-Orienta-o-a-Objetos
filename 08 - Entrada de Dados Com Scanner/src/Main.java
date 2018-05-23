
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" Informe o valor de X");
        double x = in.nextDouble();
        System.out.println("Informe o valor de Y");
        double y = in.nextDouble();
        System.out.println("A Soma de X = " + x + "e Y = " + y + " é igual a : " + (x + y));

    }

}
