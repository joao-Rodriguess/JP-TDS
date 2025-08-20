import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int [] pontuacao = new int[5];
        int soma = 0;
        Scanner console = new Scanner(System.in);
        int i = 1;
        System.out.println("As pontuações:");
        for (int indice : pontuacao){
            System.out.println("Entre com a pontuação: "+ (i++));
            int pontos = console.nextInt();
            pontuacao[indice]=pontos;
            soma += pontuacao[indice];
        }
        double media = (double)soma / pontuacao.length;
        System.out.println("A tua media: "+media);
    }

}
