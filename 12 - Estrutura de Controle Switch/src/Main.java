
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha as opçãos 1 , 2 ou 3");
        int x = in.nextInt();

        switch (x) {

            case 1:
                System.out.println("Opção 1 foi escolhida");
                break;
            case 2:
                System.out.println("Opção 2 foi escolhida");
                break;
            case 3:
                System.out.println("Opção 3 foi escolhida");
                break;
            default:
                System.out.println("Esta opção não existe");
        }
    }

}
