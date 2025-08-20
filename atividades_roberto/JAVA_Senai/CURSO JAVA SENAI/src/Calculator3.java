public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    public void findTotal(double price, String pessoa){
        double total = price*(1+tax+tip);
        System.out.println(pessoa+" $"+total);

    }
}
