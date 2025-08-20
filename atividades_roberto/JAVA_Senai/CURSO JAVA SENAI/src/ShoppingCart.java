
public class ShoppingCart {
    public static void main (String[] args){
       String custName = "Mary Smith";
       String itemDesc = "Shirt";

       double price = 21.99;
       int quantity = 2;
       double tax = 1.04;
       double total;
       String message = custName + " sei la" + quantity + " " + itemDesc;

       total = (price*quantity)*tax;
    }

    
}
