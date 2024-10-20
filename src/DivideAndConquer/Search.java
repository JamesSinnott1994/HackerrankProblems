package DivideAndConquer;

public class Search {

    public static void main(String[] args) {

        // Time Complexity of O(n)

        int[] arr = {1, 2, 3, 4, 5, 6};
        int val = 3;

        System.out.println("Index of value is : " + search(arr, val));
    }

    public static int search(int[] array, int val) {

        // Time Complexity - Log(N) - Binary Search
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int middle = (int) Math.floor((min + max) / 2);
            int currentElement = array[middle];

            if (array[middle] < val) {
                min = middle + 1;
            } else if (array[middle] > val) {
                max = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;

    }

}
