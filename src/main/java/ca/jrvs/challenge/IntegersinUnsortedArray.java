package ca.jrvs.challenge;

import java.util.Arrays;

public class IntegersinUnsortedArray {

    private int[] nums = new int[2];

    /**
     * Function to find the smallest and largest integer in a given unsorted array
     * @param unsortedArray
     * @return an integer array of length 2 with smallest and largest integer
     */
    public int[] largestSmallestIntinArray(int[] unsortedArray) {
        Arrays.sort(unsortedArray);
        nums[0] = unsortedArray[0];
        nums[1] = unsortedArray[unsortedArray.length - 1];
        return nums;
    }
}
