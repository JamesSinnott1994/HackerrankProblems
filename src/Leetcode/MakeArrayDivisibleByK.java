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

    public static int minOperationsBetterSolution(int[] nums, int k) {
        // Just get remainder. That's how many operations you need

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        return sum%k;
    }

}
