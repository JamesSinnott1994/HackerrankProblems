package SummingQuestions;

import java.util.Arrays;

public class TransformArrayByParity {
    public static int[] transformArray(int[] nums) {
        // Iterate through array
            // If number is even, replace with 0, else 1
        // Sort the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { nums[i] = 0; }
            else {  nums[i] = 1; }
        }
        Arrays.sort(nums);
        return nums;
    }
}
