
import java.util.Scanner;

import static java.lang.Math.pow;


public class ComputeBMI {
    public static void main(String[] args)
	{
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso");
       double peso = entrada.nextDouble();
        System.out.println("Digite a sua altura");
        double altura = entrada.nextInt();
        double imc = pow(altura,2)/peso;
        System.out.println(imc);
        entrada.close();
        }
}
