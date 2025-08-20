import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
     


        int x, y;
        double z;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o numero = x que deseja calcular:");
        x = leitura.nextInt();

        System.out.println("Informe o numero = y que deseja calcular:");
        y = leitura.nextInt();

        z =  ((x/y) < 3)  ? (x += y) :(x *= y);

       System.out.println("O numero, x = " + z);

        /*if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }*/
         // Use a ternary operator to perform the same logic as above.
    }
}

      
    

