
public class Main {

    public static void main(String[] args) {

        
        int x = 10;
        int y = 15;
        System.out.println("<--------- Operadores de Igualdade---------->");
        System.out.println("x == y " + (x == y));
        System.out.println("x == y " + (x != y));

        System.out.println("<--------- Operadores Relacionais---------->");
        System.out.println("X >y " + (x > y));
        System.out.println("X <y " + (x < y));
        System.out.println("X >=y " + (x >= y));
        System.out.println("X <=y " + (x <= y));

        System.out.println("<--------- Operadores Lógicos---------->");
        boolean b = x > 2 || y > 12;
        System.out.println("x>2 || y>12" + b);
        b = x > 2 && y > 12;
        System.out.println("x>2 || y>12" + b);

    }

}
