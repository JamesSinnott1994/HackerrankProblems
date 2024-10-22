package SlidingWindowPattern;

public class MinSubArrayLength {

    public static void main(String[] args) {

        // Time Complexity of O(n)

        int[] nums = {2, 3, 1, 2, 4, 3};
        int sum = 7;

        System.out.println("Minimum sub array length is: " + minSubArrayLen(nums, sum));
    }

    public static int minSubArrayLen(int[] nums, int sum) {

        int total = 0;
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;

        while (start < nums.length) {

            // If current window doesn't add up to the given sum then
            // move the window to the right
            if (total < sum && end < nums.length) {
                total += nums[end];
                end++;
            }
            // if current window adds up to at least the sum given then
            // we can shrink the window
            else if (total >= sum) {
                minLen = Math.min(minLen, end-start);
                total -= nums[start];
                start++;
            }
            // current total less than required total but we can reach the end,
            // need this or else we'll be in an infinite loop
            else {
                break;
            }

        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }

}
