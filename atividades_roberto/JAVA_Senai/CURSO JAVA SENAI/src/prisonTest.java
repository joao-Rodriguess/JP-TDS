public class prisonTest {
    public static void main(String[] args) {
//    Prisioner bubba = new Prisioner();
//    bubba.name = "bubba";
//    bubba.altura = 2.08;
//    bubba.sentenca = 4;
//
//    Prisioner twich = new Prisioner();
//    twich.name = "twich";
//    twich.altura = 1.73;
//    twich.sentenca = 3;
//
//        System.out.println(bubba == twich);

//         Prisioner po1 = new Prisioner();
//         Prisioner preto = new Prisioner();
//
//         po1.setFields("bubba",2.08,4);
//         preto.setFields("Twich", 1.05, 4);

        Prisioner preto = new Prisioner
                ("Bubba", 2.08, 4);
        System.out.println(preto.name);

      preto.display();
      preto.display(true);
    }
}
