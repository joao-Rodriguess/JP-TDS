public class ShoppingCart_ultimo {
    public static void main(String[] args) {
        //o nome da instancia foi o heitor que escolheu
        a calc = new a();

        int resultado = calc.add(43,79);
        System.out.println("O resultado é: "+ resultado);
        try{
            double outroResultadov = calc.divise(15,15);
        System.out.println("O resultado da divisão: "+outroResultadov);
        }catch (ArithmeticException ian){
            System.out.println(ian);
        }
    }
}
