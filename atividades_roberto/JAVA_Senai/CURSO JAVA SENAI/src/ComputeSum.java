import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int number;
    int mais = 0;
    for(int i = 0; i < 10; i++){
        System.out.println("Voce vai ter que digitar numeros");
        System.out.println("Digite 0 para SAIR");
        number = leitura.nextInt();
        mais += number;

        if(number == 0){
            break;
        }
    }
        System.out.println("A soma é: " + mais);
    }
}
