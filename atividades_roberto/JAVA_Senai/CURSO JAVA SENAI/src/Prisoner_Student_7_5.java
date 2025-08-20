//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private cell_7_5 sela;
    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, cell_7_5 sela){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
     this.sela=sela;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public int getSentence(){
        return sentence;
    }

    public cell_7_5 getCell(){
        return sela;
    }

    public void display(){
        System.out.println(getHeight());
        System.out.println(getName());
        System.out.println(getSentence());
        System.out.println(getCell().getName());
    }


    public void openDoor(){
        if(sela.getIsOpen()){
            System.out.println(sela.getName()+" está aberta");
            sela.setIsopen(1000);
        }
    }
}
