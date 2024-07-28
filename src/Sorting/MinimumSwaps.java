package Sorting;

public class MinimumSwaps {

    public static void runMinimumSwap() {
        int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
        System.out.println("Minimum Swaps: " + minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {

        /*
        O(n) time complexity
         */

        // "temp" is for the swap
        int minSwaps = 0, i = 0, temp;

        // We use a while loop for below as we don't want to increment the index until the current index
        // has the right value

        while (i < arr.length) {
            // Check if each index is in the right place
            if (arr[i] != i+1) {
                temp = arr[i]; // 7
                arr[i] = arr[ arr[i] - 1 ]; // Assigns the value located at index position of the current value
                arr[temp-1] = temp; // Puts the value of current index at it's correct index!!!
                minSwaps++;
            } else {
                i++; // Only increment index once it's in the right position
            }
        }
        return minSwaps;
    }

}
