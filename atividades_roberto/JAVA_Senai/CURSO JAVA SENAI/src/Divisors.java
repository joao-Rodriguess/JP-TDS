import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {
    //cria o scanner
         Scanner console = new Scanner(System.in);

         //mostra uma mensagem informativa ao usuario
        System.out.print("Enter the number :  ");
        int num = console.nextInt();//armazena o numero digitado

        //mostra uma mensagem ao usuario junto com a variavel armazenado com o numero digitado
        System.out.print("Divisors of " + num+" "+ "="+" " );

    //enquanto "i" for menor que o numero digitado ele executa
        for (int i = 1; i < num; i++) {
            //se o resto da divisão do numero digitado com a variavel definida no "for", ser diferente de zero ele irá continuar a rodar a partir do "for"
            if (num % i != 0)  {
                continue;
            }
            //caso seja diferente ira mostrar o numero
            System.out.print(i + " , ");
        }
    }
}
