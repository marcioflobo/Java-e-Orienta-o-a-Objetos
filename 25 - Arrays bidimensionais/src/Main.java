
import java.util.Random;


public class Main {

    
    public static void main(String[] args) {
        Random r = new Random();
        
        int[][] arrayX = new int[5][5];
        
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX.length; j++) {
                arrayX[i][j] = r.nextInt(10);
                System.out.println("Array["+i+"]["+j+"] = "+arrayX[i][j]);
            }
            
        }
        
    }
    
}
