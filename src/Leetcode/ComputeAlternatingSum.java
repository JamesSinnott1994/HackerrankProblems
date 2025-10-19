package Leetcode;

public class ComputeAlternatingSum {

    public static int alternatingSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                // even
                sum += nums[i];
            } else {
                // odd
                sum -= nums[i];
            }
        }

        return sum;
    }

}
