package Leetcode;

public class FindMinimumOperations {
    public static int minimumOperations(int[] nums) {
        // Variable for minOps
        // Iterate through array
        // Use modulo to check if current number is divisible by 3 i.e modulo == 0
        // if yes, continue
        // if no,
        // get modulo of current number
        // if modulo = 2
        // add 1
        // increment minOps
        // else
        // subtract 1
        // increment minOps
        // return minOps

        // Actually, no need for all the if-elses above as we just need to increment to min operations
        int minOps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                minOps++;
            }
        }
        return minOps;
    }
}
