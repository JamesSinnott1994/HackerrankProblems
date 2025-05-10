package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    /*
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */

    public static int numIdenticalPairs(int[] nums) {

        /*
        Time Complexity: O(N)
        Space Complexity: O(N)
         */

        int identicialPairs = 0;
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int num : nums) {
            occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> occurence : occurences.entrySet()) {
            int n = occurence.getValue();
            identicialPairs += (n * (n - 1) / 2);
        }
        return identicialPairs;
    }

}
