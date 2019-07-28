package ca.jrvs.challenge;

public class SwapTwoNumbers {

    /**
     *
     * Swap two values of two variables of integer data type without using third variable
     * @param nums
     * @return an array of swapped numbers which is essentialy of length two
     */
    public int[] swapNumbers(int[] nums) {
        int swappedNumbers[] = {};

        nums[0] = nums[0] + nums[1];
        nums[1] = nums[0] - nums[1];
        nums[0] = nums[0] - nums[1];
        return nums;
    }
}
