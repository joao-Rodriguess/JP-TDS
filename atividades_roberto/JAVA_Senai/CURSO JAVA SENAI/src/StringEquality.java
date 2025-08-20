import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner nomeDigitado = new Scanner(System.in);
        String nome = "";
        System.out.println("Digite um nome");
        nome = nomeDigitado.nextLine();
        if(nome.equals("Moe")){
            System.out.println("Voce é o rei do rock");
        }else {
            System.out.println("Voce não é o rei do rock");
        }
    }
}

