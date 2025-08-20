public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583;

        int[][] testCases = {
                {1582,2},
                {1583,0},
                {1583,13},
                {1583,1},
                {1583,12}
        };

        for (int i = 0; i < testCases.length; i++) {
            if (testCases[i][0] < CALENDAR_START || testCases[i][1] < 1 || testCases[i][1] > 12){
                System.out.println("Testando ano: "+testCases[i][0]+", mês: "+ testCases[i][1]+" -> Entrada invalida");
            }else {
                System.out.println("Testando ano: "+testCases[i][0]+", mês: "+ testCases[i][1]+" -> Entrada valida");
            }
        }
    }

}
