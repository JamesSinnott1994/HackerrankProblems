package MultiplePointersPattern;

public class AveragePair {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double target = 3.5;

        System.out.println("Average pair matches target average: " + averagePair(arr, target));
    }

    public static boolean averagePair(int[] array, double target) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            double average = ((double)array[start] + (double)array[end]) / 2;

            // The conditions
            if (average == target) {
                return true;
            } else if (average < target) {
                // If average is less we increase the left-most pointer as we want to get a bigger average value
                start++;
            } else {
                // If average is more we decrease the right-most pointer as we want to get a smaller average value
                end--;
            }

        }

        return false;
    }

}
