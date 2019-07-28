package ca.jrvs.challenge;

import java.lang.reflect.Array;
import java.util.HashSet;

public class DuplicateNumber {

    /**
     * Given an array that contains n+1 integers with each integer between 1 and n,
     * find the duplicate number that exists in the array
     * @param nums an array of data type integer
     * @return duplicate number of data type integer
     */
    public int findDuplicate(int[] nums){
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

        for(int num: nums) {
            if(uniqueNumbers.contains(num))
                return num;
            uniqueNumbers.add(num);
        }
    return -1;
    }
}
