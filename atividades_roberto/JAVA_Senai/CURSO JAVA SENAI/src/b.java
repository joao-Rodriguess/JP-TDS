public class b {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 9;
        int max = 0;
        if(num1 > max){
            max = num1;
        }
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }else {
        System.out.println("Todos são iguais");
        }

        System.out.println("O maximo de 3 numeros é "+ max);
    }
}
