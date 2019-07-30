package ca.jrvs.challenge;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    private  ValidParenthesis validParenthesis;
     private static HashMap<Character, Character> characterHashMap = new HashMap<Character, Character>();

    public void setCharacterHashMap() {
        this.characterHashMap.put(')','(');
        this.characterHashMap.put('}', '{');
        this.characterHashMap.put(']','[');
    }

    /**
     * Method to check if the given string has valid parenthesis or not
     * @param s
     * @return true if the given string has valid parenthesis else return false
     */
    public boolean isValidParenthesis(String s) {
            validParenthesis = new ValidParenthesis();
            validParenthesis.setCharacterHashMap();
         Stack<Character> characterStack = new Stack<Character>();
        //traverse the string
         for(int i =0; i < s.length(); i++) {
             char c = s.charAt(i);
            //check if the character is the closing bracket else push
             if(this.characterHashMap.containsKey(c)) {
                 //check if the top element of the stack has corresponding opening bracket
                  char topElement = characterStack.empty()? '#': characterStack.pop();
                  if(topElement!=this.characterHashMap.get(c)) {
                      return false;
                  }
             }
             else
                 characterStack.push(c);
             }
        return characterStack.isEmpty();
    }
}
