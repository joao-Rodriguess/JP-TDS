public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        System.out.println("Total da mesa (todos os participantes da festa): "
        + ( calc.findTotal(10,"Ian",0)
        +calc.findTotal(12, "Nahyron",0)
        +calc.findTotal(9,  "Lais",0)
        +calc.findTotal(9,  "Gideão",0)
        +calc.findTotal(7,  "Guedes",0)
        +calc.findTotal(15, "matheus",0)
        +calc.findTotal(11, "Pereira",0)
        +calc.findTotal(30, "heitor",0)
        ) + "\n\n");

        System.out.println("Total da mesa (todos os participantes da festa): "
                + ( calc.findTotal(10,"Ian",(45.0/6))
                +calc.findTotal(12, "Nahyron",(45.0/6))
                +calc.findTotal(9,  "Lais",(45.0/6))
                +calc.findTotal(8,  "Gideão",(45.0/6))
                +calc.findTotal(7,  "Guedes",(45.0/6))
                +calc.findTotal(11, "Pereira",(45.0/6))
        ) + "\n\n");
        //Find and print the entire table's total, including tax and tip
       
    } 
}
