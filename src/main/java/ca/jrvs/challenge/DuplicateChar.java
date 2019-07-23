package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
//    public static void main(String[] args) {
//        DuplicateChar duplicateChar = new DuplicateChar();
//        System.out.println(duplicateChar.duplicate("hello there"));
//    }

    /**
     * Method to find the duplicate characters in an array
     *
     * @param text that needs to be checked to find the duplicate characters
     * @return duplicate characters array
     */
    public char[] duplicate(String text) {
        HashMap<Character, Integer> testmap = new HashMap<Character, Integer>();
        ArrayList<Character> duplicateArray = new ArrayList<Character>();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            //  int count = 0;
            if (testmap.containsKey(c)) {
                int count = testmap.get(c);
                count++;
                testmap.put(c, count);
            } else {
                testmap.put(c, 1);
            }
        }


        for (Map.Entry<Character, Integer> item : testmap.entrySet()) {
            Character key = item.getKey();
            Integer value = item.getValue();
            if (value > 1)
                duplicateArray.add(key);
        }


        return duplicateArray.toString().toCharArray();
    }
}
