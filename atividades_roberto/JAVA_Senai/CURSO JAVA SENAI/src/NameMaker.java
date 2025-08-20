import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String PrimeiroNome, nomeMeio, ultimoNome, nomeCompleto;

        Scanner in  = new Scanner(System.in);
        System.out.println("Entre com seu primeiro nome: ");
        PrimeiroNome = in.next();
        System.out.println("Entre com seu nome do meio: ");
        nomeMeio = in.next();
        System.out.println("Entre com o seu ultimo nome: ");
        ultimoNome = in.next();
        nomeCompleto = PrimeiroNome +" "+ nomeMeio +" "+ ultimoNome;
        System.out.println("Seu nome completo é: "+ nomeCompleto);
    }


}
