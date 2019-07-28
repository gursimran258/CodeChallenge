package ca.jrvs.challenge;

public class FibonacciNumber {

    /**
     * To get fibonacci sum of n numbers of fibonacci series
     * @param n
     * @return the sum
     */
    public int getFibonacci(int n) {
        int t1 = 0;
        int t2 = 1;
        int sum = 0;
        int fiboSum = 0;
        for (int i = 1; i <= n; i++) {
            fiboSum = fiboSum + t1;
            sum = t1+t2;
            t1=t2;
            t2=sum;
        }
        return fiboSum;
    }
}
