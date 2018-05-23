
public class Main {

   
    public static void main(String[] args) {
       int x = 5, y=6;
       
       // "=" Atribui valor a variável
       // += pré soma Atribui o valor variável + o valor presente na variável >>> x +=y;
       x=y;
        System.out.println("x=y : " +x);
        System.out.println("x+=y :" + (x+=y));
        
        System.out.println("x=+y :"+ (x-=y));
        
        System.out.println("x++: " + x++);
        System.out.println("x--: " + x--);
        
        System.out.println("--x: " + --x);
        System.out.println("--x: " + --x);
                
               
    }
    
}
