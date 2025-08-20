import java.lang.*;

public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.wom";

        int max = str.length();
        int count = 0;

        for(int j = 0; j < max; j++ ) {
            if (str.charAt(j) != 'w') {
                continue;

            } count ++;
        }
        System.out.println("Counting w : " + count );
    }
}
    

