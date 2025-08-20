//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        cell_7_5 A1 = new cell_7_5("A1",true,4);
        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, A1);

        bubba.display();
    }
}
