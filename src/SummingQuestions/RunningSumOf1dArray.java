package SummingQuestions;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        // Set sum to be first value
        // Iterate through the array
        // Start at index i (equal to 1 initially)
        // Set sum to be i + sum
        // Set i to be sum
        // Increment i
        // Repeat the process

        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
