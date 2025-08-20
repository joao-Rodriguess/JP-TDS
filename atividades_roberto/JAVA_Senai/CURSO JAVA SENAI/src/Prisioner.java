public class Prisioner {
     String name;
     double altura;
     int sentenca;

//    public static void main(String[] args) {
//        setName("bubba");
//
//    }
//    public setName(String name){
//        this.name=name;
//        System.out.println(name);
//    }

    public Prisioner (String name, double altura, int sentenca){
        this.name=name;
        this.altura=altura;
        this.sentenca=sentenca;
    }

    public void pensar(){
        System.out.println("ha ha ha ovu me vinagre");
    }

    public void display(){
        System.out.println("Nome "+ name);
        System.out.println("Altura "+ altura);
        System.out.println("Sentenca "+ sentenca+"\n");
    }

    public void display(boolean b){
        System.out.println("Nome "+ name);
        System.out.println("Altura "+ altura);
        System.out.println("Sentenca "+ sentenca);
        if (b == true){
            pensar();
        }
    }
}
