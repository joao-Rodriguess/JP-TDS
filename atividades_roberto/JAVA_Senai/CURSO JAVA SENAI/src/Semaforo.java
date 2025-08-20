import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        int semaforo;
        Scanner digita = new Scanner(System.in);
        System.out.println("Informe que cor esta o semaforo:\n Verde:1\n Amarelo:2\n Vermelho:3");
        System.out.println("{");semaforo = digita.nextInt();

        switch (semaforo){
            case 1:
                System.out.println("Ta verde");
                break;
            case 2:
                System.out.println("Ta Amarelo");
                break;
            case 3:
                System.out.println("Ta Vermelho");
                break;
            default:
                System.out.println("Invalido esse numero cara");
                break;
        }
    }
}
