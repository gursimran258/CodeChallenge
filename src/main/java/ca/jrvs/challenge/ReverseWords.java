package ca.jrvs.challenge;

public class ReverseWords {

    /**
     * Function to reverse the words in the given string
     * @param sentence
     * @return reversed String
     */
    public String reverseWords(String sentence) {
        String line[] = sentence.split(" ");
        String answer = "";

        for(int i = line.length-1; i>=0;i--) {
            answer += line[i] + " ";
        }

        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}
