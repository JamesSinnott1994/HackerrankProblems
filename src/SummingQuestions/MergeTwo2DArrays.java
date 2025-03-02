package SummingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwo2DArrays {

    public static void main(String[] args) {

        // Time Complexity of O(NLog(N))
        // Space Complexity of O(N)

        int[][] nums1 = { {1,2}, {2,3}, {4,5} };
        int[][] nums2 = { {1,4}, {3,2}, {4,1} };
        System.out.println("Values are : " + Arrays.deepToString(mergeArrays(nums1, nums2)));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        // Merge the two arrays into one array that is sorted in ascending order by id, respecting the conditions.

        // Iterate through first array
        // Use dictionary to store key-value pairs of ID and it's value

        // Iterate through second array
        // Store key-value pairs or sum value if ID already exists

        // Create a new array

        Map<Integer, Integer> idValues = new HashMap<Integer, Integer>();

        for (int[] array : nums1) {
            idValues.put(array[0], array[1]);
        }

        for (int[] array : nums2) {
            if (idValues.containsKey(array[0])) {
                int summedValue = idValues.get(array[0]) + array[1];
                idValues.replace(array[0], summedValue);
            } else {
                idValues.put(array[0], array[1]);
            }
        }

        // For every key-value pair in the map
        // Create an array, and add it to main array

        int[] idArray = new int[idValues.size()]; // Will hold our IDs
        int x = 0;
        for (int i : idValues.keySet()) { // Just gets the keys
            idArray[x] = i;
            x++;
        }
        Arrays.sort(idArray); // Sorts IDs

        int[][] sortedIdValues = new int[idValues.size()][2];
        for (int i = 0; i < idArray.length; i++) {
            sortedIdValues[i] = new int[]{ idArray[i], idValues.get(idArray[i]) };
        }
        return sortedIdValues;

    }

}
