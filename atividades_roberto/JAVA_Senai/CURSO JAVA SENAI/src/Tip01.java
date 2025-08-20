public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

      double  tax = 0.05;
      double  comissao = 0.15;

      double Person1 = 10.00;
      double Person2 = 12.00;
      double Person3 = 9.00;
      double Person4 = 8.00;
      double Person5 = 7.00;
      double Person6 = 15.00;
      double Person7 = 11.00;
      double Person8 = 30.00;

      double[] pessoa = {10,12,9,8,7,15,11,30};
      for (int i = 1; i < pessoa.length; i++){
        System.out.println("Person " + (i+1) + "vai pagar " + pessoa[i]*(1+tax+comissao));
      }

    }    
}
