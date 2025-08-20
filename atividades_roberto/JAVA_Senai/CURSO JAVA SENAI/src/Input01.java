import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Alguma coisa");
        System.out.println(input);

        System.out.println((Integer.parseInt(input)+1));

        int num1 = (Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero")));

        System.out.println(num1);
        
    }
}
