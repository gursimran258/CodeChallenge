package ca.jrvs.challenge;

import java.util.Arrays;

public class ValidAnagram {

    /**
     * To check if one string is anagram of another string or not
     * @param s
     * @param t
     * @return true if one string is anagran of anoher string, else returns false.
     */
    public boolean IsValidAnagrams(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        return Arrays.equals(firstString,secondString);
    }
}
