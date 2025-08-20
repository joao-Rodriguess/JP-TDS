import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> estudantes = new ArrayList<String>();
        estudantes.add("Ian");
        estudantes.add("Heitor");
        estudantes.add("Jhon");
        estudantes.add("Kaua");

        System.out.println("Estudantes: " + estudantes);
        System.out.println("Aqui está o tanto de estudantes: "+ estudantes.size());

        estudantes.add(0,"Nahyron");
        estudantes.add(1,"Pietra");
        estudantes.remove(3);

        System.out.println("Estudantes "+estudantes);
    }
    
}
