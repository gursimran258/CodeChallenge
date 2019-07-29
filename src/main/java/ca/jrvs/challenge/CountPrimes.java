package ca.jrvs.challenge;

public class CountPrimes {

    /**
     * Determines list of all primes less than given number
     * @param n
     * @return list of prime numbers
     */
    public int[] primesList(int n) {
        int[] numsList = new int[n];
        int j = 0;
        for(int i =2; i < n; i++) {
            if(isPrime(i)) {
                numsList[j] = i;
                j++;
            }
        }
        int[] numbers = new int[j];
        System.arraycopy(numsList,0,numbers,0,j);
        return numbers;
    }
     private boolean isPrime(int num) {
        for(int i = 2 ; i<num;i++) {
            if(num%i==0)
                return false;
        }
         return true;
     }
}
