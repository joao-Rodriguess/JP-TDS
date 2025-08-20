import java.util.Objects;
import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Objects.requireNonNull(Input04.class.getResourceAsStream("input04text.txt")));
        
        //Edit these lines to advance the scanner
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPos = Integer.parseInt(sc.next());
        int yPos = Integer.parseInt(sc.next());
        
        System.out.println("X: " + xPos + ", Y: " + yPos);
        sc.close();
    }    
}
