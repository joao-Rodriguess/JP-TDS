public class ArrayEx1 {

    public static void main(String args[]) {
        
       long[] primeNum = new long[20];
        int[] even=new int[5];
        long [] sla = new long[50];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        System.out.println(primeNum[19]);
        System.out.println();

    }

}
