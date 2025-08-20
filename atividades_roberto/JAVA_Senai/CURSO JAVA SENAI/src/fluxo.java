import java.util.Scanner;

public class fluxo {
    public static void main(String[] args) {
        int a = 100,res;
        try{
            System.out.println("Informe o valor de b");
            Scanner console = new Scanner(System.in);

            int b = console.nextInt();

            System.out.println("Informe o de c");
            int c = console.nextInt();

            res = 10 / (b-c);

            System.out.println("O resultado é " + res);
        }catch (Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }
        System.out.println("Depois do bloco catch");
    }
}
