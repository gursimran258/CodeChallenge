package ca.jrvs.challenge;

public class ValidPalidrome {

    /**
     * Check if the given string is palindrome or not
     * @param str
     * @return true if the string if palindrom else false
     */
    public boolean isPalindrome(String str) {
        String reverseStr = null;
        if (str.equals(reverseString(str))) {
            return true;
        }
        return false;
    }

    /**
     * Helper function to reverse the string
     * @param str
     * @return the reversed string
     */
    public String reverseString(String str) {
        if (str.length() == 0)
            return str;
        else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}


