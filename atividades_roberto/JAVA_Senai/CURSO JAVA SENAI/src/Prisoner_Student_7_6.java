//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner_Student_7_6 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell_Student_7_6 cell;
    private static int prisonerCount = 0;
    private int bookingnumber;
    
    //Constructor
    public Prisoner_Student_7_6(String name, double height, int sentence, Cell_Student_7_6 cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.cell = cell;
     bookingnumber = prisonerCount++;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
        System.out.println("Booking: "+ bookingnumber);
        System.out.println("Contagem de prisioneiros: "+ prisonerCount);
        System.out.println("");
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell_Student_7_6 getCell() {
        return cell;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell_Student_7_6 cell) {
        this.cell = cell;
    }
}
