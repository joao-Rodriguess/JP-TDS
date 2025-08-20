import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        System.out.println("Entre com a idade:");
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        boolean maiorDEIdade = false;

        maiorDEIdade = idade >= 18;

        System.out.println(maiorDEIdade);
       
    }
}
