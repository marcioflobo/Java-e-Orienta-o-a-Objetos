
import java.util.Random;

public class Main {

  
    public static void main(String[] args) {
        Random r = new Random();
        int[] arrayX = new int[5];
        int[] arrayY = new int[5];
        int[] arrayS = new int[5];
        
        System.out.println("Valores de X");
        for(int i = 0; i< arrayX.length; i++){
        arrayX[i] = (r.nextInt(11));
            System.out.println("ArrayX ["+i+"] = "+arrayX[i]);
        }
        
        
        System.out.println("--------------------");
        System.out.println("Valores de Y");
        for(int i = 0; i< arrayY.length; i++){
        arrayY[i] = (r.nextInt(11));
            System.out.println("ArrayY ["+i+"] = "+arrayY[i]);
        }
        
        System.out.println("--------------------");
        System.out.println("Soma Dos vetores");
        for(int i = 0; i<arrayS.length; i++){
            arrayS[i] = arrayX[i]+arrayY[i];
            System.out.println("ArrayS["+i+"]"+" = A "+arrayX[i]+"+"+arrayY[i] +"="+arrayS[i]);
        }
        
    }
    
}
