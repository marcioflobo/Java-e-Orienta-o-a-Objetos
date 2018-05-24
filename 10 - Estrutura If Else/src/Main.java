
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o Valor de X ");
        x = in.nextInt();
        System.out.println("Informe o Valor de Y ");
        y = in.nextInt();
        
        if(x > y){
            System.out.println("X > Y " + (x > y));
        }else{
            System.out.println("X < Y " + (x < y));
        }
        
    }

}
