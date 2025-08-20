public class titulo_Tesouso {
    public String nome;
    public double balance;
    public int term, mesesRestantes;
    public double rate;

    public void definirTermosTaxa(int t){
        if(t >= 0 && t < 12 ){
            rate = 0.005;
        }else if(t >= 12 && t < 24){
            rate = 0.010;
        } else if (t >= 24 && t < 26) {
            rate = 0.015;
        } else if (t >= 36 && t < 48) {
            rate = 0.020;
        }else if (t >= 48 && t <= 60){
            rate =0.025;
        }else{
            System.out.println("Termo invalido");
            t = 0;
        }

        term = t;
        mesesRestantes = t;
    }

    public void ganharJuros(){
        if(mesesRestantes > 0){
            balance += balance*rate/12;
            mesesRestantes--;
            System.out.println("Saldo: R$"+balance);
            System.out.println("Juros: "+rate);
            System.out.println("Meses Restantes: "+mesesRestantes);
        }else {
            System.out.println("Acabou os meses");
        }
    }
}
