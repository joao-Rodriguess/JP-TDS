import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        double precoIngresso = 0;
        System.out.print("Enter the movie ticket price \n");
        Scanner teclado = new Scanner(System.in);
        precoIngresso = teclado.nextDouble();

        System.out.println("Entre com a avaliação do filme!! \n");
       int nota = teclado.nextInt();

       if(precoIngresso >= 12.00 && nota ==5){
           System.out.println("Estou interessado para assistir");
       }else {
           System.out.println("Não estou interessado em assistir o filme");
       }
    }
}
