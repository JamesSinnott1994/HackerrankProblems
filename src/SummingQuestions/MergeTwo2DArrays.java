package SummingQuestions;

import java.util.*;

public class MergeTwo2DArrays {

    public static void main(String[] args) {

        // Time Complexity of O(NLog(N))
        // Space Complexity of O(N)

        int[][] nums1 = { {1,2}, {2,3}, {4,5} };
        int[][] nums2 = { {1,4}, {3,2}, {4,1} };
        System.out.println("Values are : " + Arrays.deepToString(mergeArraysOptimized(nums1, nums2)));
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

    public static int[][] mergeArraysOptimized(int[][] nums1, int[][] nums2) {
        // Initialize pointers for both arrays
        int i = 0, j = 0;
        // List to store our merged results
        List<int[]> resultList = new ArrayList<>();

        // Traverse both arrays with two pointers
        while (i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];

            if (id1 < id2) {
                // Id1 is smaller, add it to result
                resultList.add(new int[]{id1, val1});
                i++;
            } else if (id2 < id1) {
                // Id2 is smaller, add it to result
                resultList.add(new int[]{id2, val2});
                j++;
            } else {
                // Ids are equal, sum the values
                resultList.add(new int[]{id1, val1 + val2});
                i++;
                j++;
            }
        }

        // Add remaining elements from nums1, if any
        while (i < nums1.length) {
            resultList.add(nums1[i]);
            i++;
        }

        // Add remaining elements from nums2, if any
        while (j < nums2.length) {
            resultList.add(nums2[j]);
            j++;
        }

        // Convert List to array
        int[][] result = new int[resultList.size()][2];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }

}
