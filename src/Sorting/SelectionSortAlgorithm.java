package Sorting;

public class SelectionSortAlgorithm {

    public static void main(String[] args) {

        int[] arr = {34, 22, 10, 19, 17};
        selectionSort(arr);
        boolean finished = true;
    }

    private static int[] selectionSort(int[] arr) {

        for (var i = 0; i < arr.length; i++) {

            int lowest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }

            if (i != lowest) {
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }

        }
        return arr;
    }
}
