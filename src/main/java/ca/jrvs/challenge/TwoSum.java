package ca.jrvs.challenge;

public class TwoSum {

    public int[] checkTwoSum(int [] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j=0; j<nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }

//    public static void main(String[] args) {
//        int[] nums = {1,3,5,2};
//        int target = 4;
//
//    }
}
