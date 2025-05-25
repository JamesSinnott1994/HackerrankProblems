package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SneakyNumbers {
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
}
