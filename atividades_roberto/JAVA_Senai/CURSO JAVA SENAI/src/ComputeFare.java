import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int tarifa;

        if(age <= 11){
            tarifa = 3;
        } else if (age > 11 && age < 65) {
            tarifa = 5;
        }else {
            tarifa = 3;;
        }
        System.out.println(tarifa);
    }
}
