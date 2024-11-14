package CodeEditor;

public class Editor {

    public static void main(String[] args) {

        String word = "aabba"; // Output should be 4 operations according to Hackerrank
        System.out.println(getMaximumOperations(word));

        // aaaba - 1 operations
        // aaaaa - 2 operations
    }

    public static long getMaximumOperations(String s) {

        // Return the number of operations
        int maxOperations = 0;

        // Have character array in order for us to perform replacements
        char[] chars = s.toCharArray();

        // Loop through string to choose characters
        for(int i = 1; i <= s.length()-2; i++) {

            // Check if character criteria is met
            if ( chars[i-1] == chars[i] && chars[i] != chars[i+1] ) {

                // Replace characters
                chars[i+1] = chars[i-1];
                maxOperations+=1;
            }

        }
        return maxOperations;
    }
}
