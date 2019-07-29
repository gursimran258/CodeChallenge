package ca.jrvs.challenge;

import java.util.Arrays;

public class DuplicateInArray {
    /**
     * Find if array contains duplicate numbers
     * @param numList
     * @return true if array contains duplicate
     */
    public boolean containsDuplicae(int[] numList) {
        Arrays.sort(numList);
        for(int i = 0 ; i < numList.length-1; i++) {
            if(numList[i] == numList[i+1])
                return true;
        }
        return false;
    }
}
