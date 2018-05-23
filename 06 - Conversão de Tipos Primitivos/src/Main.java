
public class Main {

    
    public static void main(String[] args) {
        
        // conversão implicita
        byte b =19;
        short s = b;
        int i = s;
        float f =i;
        double d = f;
        String st = "45678";
        
        System.out.println("------------------ Conversões implicitas-----------------");
        System.out.println("b: "+b);   
        System.out.println("s: "+s);
        System.out.println("i: " +i);
        System.out.println("f: " +f);
        System.out.println("d: "+d);
        
        System.out.println("------------------ Conversões TypeCast explicitas-----------------");
        f = (float)b;
        System.out.println("f typeCast b : " + f);
        
        d = Double.parseDouble(st);
        System.out.println("O Valor de D = st é : " + d);
    }
    
}
