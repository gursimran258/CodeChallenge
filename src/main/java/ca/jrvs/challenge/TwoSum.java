package ca.jrvs.challenge;

import java.util.HashMap;

public class TwoSum {

    /**
     * Brute force approach to get the positions of two integers that sum to target
     * this has two loops leading to complexity of  O(n*n)
     *
     * @param nums
     * @param target
     * @return int array of two positions of the integers that sum to target
     */
    public int[] checkTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    /**
     * Hash-map approach to find two elements that sum to target
     * It has only one iteration with better time complexity of order O(n)
     *
     * @param nums
     * @param target
     * @return integer array of two positions of elements that sum to target
     */
    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> posMap = new HashMap<Integer, Integer>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (posMap.containsKey(target - nums[i])) {
                res[0] = posMap.get(target - nums[i]);
                res[1] = i;
                break;
            }
            posMap.put(nums[i], i);
        }
        return res;

    }

}
