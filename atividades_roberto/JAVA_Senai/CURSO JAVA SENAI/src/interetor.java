import java.util.ArrayList;
import java.util.Iterator;

public class interetor {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Mike");
        names.add("Matt");
        names.add("NIck");

        System.out.println(" ");

        for (String i: names){
            System.out.println(" O nome é: "+ i);
        }
        System.out.println("");
        Iterator<String> iterator =  names.iterator();
        while (iterator.hasNext()){
            System.out.println("O nome é: "+ iterator.next()+iterator.next()+21);
        }

    }
}
