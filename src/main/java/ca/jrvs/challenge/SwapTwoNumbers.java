package ca.jrvs.challenge;

public class SwapTwoNumbers {

    public int[] swapNumbers(int[] nums) {
        int swappedNumbers[] = {};

        nums[0] = nums[0] + nums[1];
        nums[1] = nums[0] - nums[1];
        nums[0] = nums[0] - nums[1];
        return nums;
    }
}
