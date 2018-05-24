
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int[50];
        
        for (int i =0; i<array.length; i++){
            array[i] = i;
            System.out.println("Array ["+i+"] = " +i);
        }
    }
    
}
