import  java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int num = aleatorio.nextInt(3);
        System.out.println(num);

    }
}
