public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Roupas";
        String message;


        double preco, imposto, totalPrice;
        int quantidade;

        preco = 25.00;
        imposto = 0.07;
        quantidade = 2;
        totalPrice = (preco * quantidade) + (preco * quantidade * imposto);

        message = custName+" quer comprar "+ quantidade + " " + itemDesc;
        message +=("\nO preço total é " + totalPrice);

        System.out.println(message);


    }
}
