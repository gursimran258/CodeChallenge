package ca.jrvs.challenge;

public class PowerTwo {
    /**
     * Funtion to determine if n is the power of 2
     * @param n is an integer
     * @return true if number is power of two else it returns false
     */
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        return ((n & (n-1)) == 0);
    }

}
