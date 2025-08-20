import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        int debito;
        int sacar;
        int escolha;
        boolean finalizar = false;
        int finalizar1 = 0;


            finalizar1 = 1;
            CheckingAccount minhaConta = new CheckingAccount();
            minhaConta.balance = 1000;

            System.out.println("Seu saldo é: "+minhaConta.balance);
            System.out.println("Informe o nome:");
            nome = leitura.next();
            minhaConta.name = nome;

        while (!finalizar){
            System.out.println("0.Finalize\n1.Para Deposito \n2.Para saque");
            escolha = leitura.nextInt();

            if (escolha==2) {
                System.out.println("Quanto quer sacar?:");
                sacar = leitura.nextInt();
                System.out.println(minhaConta.name+" informamos que: ");
                minhaConta.withdraw(sacar);
            } else if (escolha==1) {
                System.out.println("Quanto quer depositar?:");
                debito = leitura.nextInt();
                System.out.println(minhaConta.name+" informamos que: ");
                minhaConta.withdraw2(debito);
            }else if (escolha==0){
                finalizar1=0;
            }else{
                System.out.println("Digite algo da maneira que instruimos\n");
                continue;
            }

            if (finalizar1==0){
                finalizar=true;
            }

        }
        //instanciando a classe


//
//        titulo_Tesouso naosei = new titulo_Tesouso();
//
//        naosei.balance = 1000;
//        int term = 12;
//        naosei.definirTermosTaxa(term);
//        for (int i = 0; i <= term; i++){
//            naosei.ganharJuros();
//        }


    }
}
