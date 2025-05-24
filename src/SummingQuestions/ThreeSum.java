package SummingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        /*
        Approach, sort array of nums
        Now that array is sorted, we can fix i in place, and use two pointer solution on the rest of the array
        Check previous number for duplicate
         */

        List<List<Integer>> result = new ArrayList<>(); // Stores triplets
        Arrays.sort(nums); // Sort the input array nums in non-decreasing order. Sorting the array helps in avoiding duplicate triplets.

        for (int i = 0; i < nums.length; i++) {
            // If current element is a duplicate of the previous element we skip it
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // Initialize pointers
            int j = i + 1;
            int k = nums.length - 1;

            // Two pointer approach
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k]; // Sum of current triplet

                // Adjust pointers based on total
                if (total > 0) { k--; } // If total sum is greater than 0, decrement k to decrease the total sum
                else if (total < 0) { j++ ;} // If total sum is less than 0, increment j to increase the total sum
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k])); // Add triplet

                    // Skip duplicates for j
                    j++;
                    while (nums[j] == nums[j-1] && j < k) { j++; }
                }
            }
        }
        return result;
    }

}
