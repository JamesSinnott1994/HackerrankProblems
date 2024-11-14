package Sorting;

public class BubbleSortAlgorithm {

    /*
    Based on Colt Steele course on Udemy
     */

    public static void main(String[] args) {

        int[] arr = {37, 45, 29, 8};
        bubbleSort(arr);
        boolean finished = true;
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap!
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
