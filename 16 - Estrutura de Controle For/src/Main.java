
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
        System.out.println("Informe o Divisor");
        
        for(int i = 2; i<30; i++){
            System.out.println("I = " + i);
            
            if((i %2) ==0){
                System.out.println("continue");
                continue;
            }
            if( i ==25){
                System.out.println("Saindo do laço");
                break;
            }
        }
        
    }
    
}
