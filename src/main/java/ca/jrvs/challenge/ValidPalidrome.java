package ca.jrvs.challenge;

public class ValidPalidrome {

    public boolean isPalindrome(String str) {
        String reverseStr = null;
        if (str.equals(reverseString(str))) {
            return true;
        }
        return false;
    }

    public String reverseString(String str) {
        if (str.length() == 0)
            return str;
        else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}


