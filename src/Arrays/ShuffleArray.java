package Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        // Create new array of size n*2
        // Two pointers to iterate through num, x and y
        // x = 0; y = n
        int[] result = new int[n*2];

        int x = 0;
        int y = n;
        int i = 0;
        while (x < n) {
            result[i] = nums[x];
            result[i+1] = nums[y];
            i+=2;
            x++;
            y++;
        }
        return result;
    }
}
