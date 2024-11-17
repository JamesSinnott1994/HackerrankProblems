package Sorting;

public class InsertionSortAlgorithm {

    public static void main(String[] args) {

        int[] arr = {2, 1, 9, 76, 4};
        insertionSort(arr);
        boolean finished = true;
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            for (int j = i - 1; j >= 0 && arr[j] > currentValue; j--) {
                // Swap values
                arr[j+1] = arr[j];
                arr[j] = currentValue;
            }
        }
        return arr;
    }

}
