public class c {
    public static void main(String[] args) {
        int n = 10;
        int sum = 10;
        while(n >= 1){
            System.out.println(n);
            System.out.println("["+sum+"]");
            sum = sum + n;
            n--;

        }
        System.out.println("A soma dos inteiros de 1 a 10 é "+ sum);
    }
}
