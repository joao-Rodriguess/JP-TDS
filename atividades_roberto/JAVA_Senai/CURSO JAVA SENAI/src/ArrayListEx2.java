import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
       num.add(66);
       num.add(78);
       num.add(95);
       num.add(86);

        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()){
            System.out.println("Numeros: "+iterator.next());
        }

//        for(int i = 0; i < num.size(); i++){
//            int n = num.get(i);
//            if(n%2 == 0){
//                num.remove(i);
//            }
//        }


        Iterator<Integer> sla = num.iterator();
        while (sla.hasNext()) {
            int n = sla.next();
            if (n % 2 == 0) {
                sla.remove(); // Remove de forma segura
            }
        }

        System.out.println("Numeros "+num);

    }
}
