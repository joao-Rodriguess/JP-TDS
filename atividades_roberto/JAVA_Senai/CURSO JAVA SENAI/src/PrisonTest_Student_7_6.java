//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest_Student_7_6 {
    public static void main(String[] args){
        Cell_Student_7_6 cellA1 = new Cell_Student_7_6("A1", false, 1234);
        Cell_Student_7_6 cellB1 = new Cell_Student_7_6("B1", false, 1234);
        Cell_Student_7_6 cellC1 = new Cell_Student_7_6("C1", false, 1234);
        Cell_Student_7_6 cellD1 = new Cell_Student_7_6("D1", false, 1234);
        
        Prisoner_Student_7_6 bubba = new Prisoner_Student_7_6("Bubba", 2.08, 4, cellA1);
        Prisoner_Student_7_6 ian = new Prisoner_Student_7_6("Ian",1.65,20,cellB1);
        Prisoner_Student_7_6 nayron = new Prisoner_Student_7_6("Nayron", 1.86, 30, cellC1);
        Prisoner_Student_7_6 JonhBlack = new Prisoner_Student_7_6("Preto", 1.45, 45, cellD1);

        System.out.println(bubba);
        System.out.println(ian.getName());
        System.out.println(nayron);
        System.out.println(JonhBlack);
        
    }
}
