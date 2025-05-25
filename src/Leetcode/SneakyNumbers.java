package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SneakyNumbers {

    /*
    In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
    Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an
    additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two
numbers (in any order), so peace can return to Digitville.
     */

    public int[] getSneakyNumbers(int[] nums) {
        // Iterate through
        // Add num to a map
        // If num already exists in map
        // Add to results array
        int[] results = new int[2];
        Map<Integer, Boolean> numbersFound = new HashMap<>();

        int i = 0;
        for (int num : nums) {
            if (numbersFound.containsKey(num)) {
                results[i] = num;
                i++;
                if (i == 2) {
                    break;
                }
            } else {
                numbersFound.put(num, true);
            }
        }
        return results;
    }

    public static int[] getSneakyNumbersOptimized(int[] nums) {
        // O(1)
        int[] results = new int[2];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]); // Getting the num VALUE at each position
            if (nums[num] < 0) {
                results[idx++] = num;
            } else {
                nums[num] = -nums[num];
            }
        }

        return results;
    }
}
