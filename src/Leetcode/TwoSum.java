package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        // Need a Linear Time solution
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        // Get complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seenNumbers.containsKey(complement)) {
                return new int[]{seenNumbers.get(complement), i};
            } else {
                seenNumbers.put(nums[i], i);
            }
        }

        return new int[]{}; // Return empty array if nothing found

    }

}
