package SlidingWindowPattern;

public class MaxSum {

    public static void main(String[] args) {

        int[] arr = {2, 6, 9, 2, 1, 8, 5, 6, 3};
        int num = 3;

        System.out.println("Max sum is : " + maxSubarraySum(arr, num));
    }

    public static int maxSubarraySum(int[] arr, int num) {

        int maxSum = 0;
        int tempSum = 0;

        if (arr.length < num) {
            return 0;
        }

        // Gets initial maximum sum of the window
        for (int i = 0; i < num; i++) {
            maxSum += arr[i];
        }
        tempSum = maxSum;

        for (int i = num; i < arr.length; i++) {
            tempSum = tempSum - arr[i - num] + arr[i]; // Gets sum of the window that we move forward by one
            maxSum = Math.max(maxSum, tempSum); // Gets new maximum if it exists
        }

        return maxSum;

    }

}
