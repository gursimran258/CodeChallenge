package ca.jrvs.challenge;

public class EvenOdd {
    /**
     * Checks if a number is odd or even by modulo approach
     * Returns true if even, returns false if odd
     * @param num
     */
    public boolean evenOddModulo(int num) {
        return num % 2 == 0;
    }

    /**
     * Checks if a number is odd or even by bit approach
     * Returns true if even, returns false if odd
     * @param num
     */
    public boolean evenOddBit(int num) {
        String binaryString = Integer.toBinaryString(num);
        char lastBit = binaryString.charAt(binaryString.length()-1);
        return lastBit == '0';
    }
}
