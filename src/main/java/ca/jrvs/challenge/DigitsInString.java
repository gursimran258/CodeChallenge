package ca.jrvs.challenge;

import java.util.regex.Pattern;

public class DigitsInString {

    /**
     * Find if a string only contains any non-digit character
     * @param input
     * returns true if there are only digits in string
     * returns false if there is any non-digit character in string
     */
    public boolean checkDigits(String input) {
        Pattern digitPattern = Pattern.compile(".*\\D.*");
        return !digitPattern.matcher(input).matches();
    }
}
