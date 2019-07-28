package ca.jrvs.challenge;

import java.util.HashSet;

public class MissingNumber {

    /**
     * Given an array containing n distinct integers, find the missing number in array
     * @param nums
     * @return the missibg number
     */
    public int findMissingNumber(int[] nums){

        HashSet<Integer> numSet = new HashSet<Integer>();
        for( int num: nums) {
        numSet.add(num);
        }
    for(int i= 0; i < nums.length+1; i++) {
     if(!numSet.contains(i))
         return i;
    }
    return -1;
    }
}
