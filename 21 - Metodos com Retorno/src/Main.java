
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor de x");
        
        double x = in.nextDouble();
        
        System.out.println("Informe o valor de y");
        double y = in.nextDouble();
        Matematica m = new Matematica();
        
        System.out.println(" A Soma de "+x+" e "+y+" é = "+m.soma(x, y) );
    }
    
}
