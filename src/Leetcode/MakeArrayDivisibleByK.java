package Leetcode;
import java.util.Arrays;

// Minimum Operations to Make Array Sum Divisible by K
public class MakeArrayDivisibleByK {

    public static int minOperations(int[] nums, int k) {
        // Store value for minOperations
        // while sum of the current array is not divisible by k
        // Get the sum of the current array and determine if it is divisible by k
        // If yes
            // return minOperations
        // If not
            // decrement value of first non-zero integer

        int minOperations = 0;
        int i = 0;
        while (sum(nums) % k != 0) {
            if (nums[i] != 0) {
                nums[i] = nums[i] - 1;
                minOperations++;
            } else {
                i++;
            }
        }
        return minOperations;
    }

    public static int sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

}
