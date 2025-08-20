public class CheckingAccount {
    double balance; //saldo da conta
    String name;//nome de alguem

    //metodo para realizar uma retirada de dinheiro
    public void withdraw (double valor){
        if(valor < 0) {
            System.out.println("Aviso: o valor da retirada não pode ser negativo");
        } else if (valor > balance) {
            System.out.println("Aviso: Saldo insuficiente para retirar.");
        } else {
            balance -= valor;
            System.out.println("Retirada de R$ "+valor+ " realizada com sucesso");
            System.out.println("Novo saldo: R$ "+balance+"\n");
        }

    }

    public void withdraw2(double valor1){
        if(valor1 < 0) {
            System.out.println("Aviso: o valor do debito não pode ser negativo");
        }
        else {
            balance += valor1;
            System.out.println("Debito de R$ "+valor1+ " realizada com sucesso");
            System.out.println("Novo saldo: R$ "+balance+"\n");
        }
    }

}
