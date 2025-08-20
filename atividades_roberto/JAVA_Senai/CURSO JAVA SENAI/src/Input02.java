import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Novo titulo",
                0,
                null
                );


        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Nova Mensagem dos banidos!!!",
                "Dialog Title",
                2,
                null,
                null,
                "outra mensagem aqui");
        
        
        String[] acceptableValues = {"Ian", "Josué", "Nayroh"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}
