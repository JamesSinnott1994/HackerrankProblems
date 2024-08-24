package MaxProductOfWordLengths;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProduct {

    public static void main(String[] args) {

        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef", "ylkgh"};

        int result = Result.maxProduct(words); // Expected: 30
        System.out.println("result : " + result);

    }

}

class Result {

    /*
    * Complete the "maxProduct" function below.
    * The function takes array of string as parameter
    *
    * The functin is expected to return an INTEGER.
     */

    public static int maxProduct(String[] words) {

        // Sort list of strings in descending order so that the largers strings appear first
        // This will save a tremendous amount of iterations as the first product that we get IS the
        // maximum product, therefore we can break out of the list once we have this

        // Sort the array in descending order based on string length
        // OPTIMIZATION 2!
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return Integer.compare(word2.length(), word1.length());
            }
        });

        // Iterate through list to get maxProduct
        int maxProduct = 0;
        boolean maxProductFound = false;
        for (int i = 0; i < words.length; i++) {

            if (!maxProductFound) {
                for (int j = i+1; j < words.length; j++) {

                    int currentProduct = 0;

                    // Check that two words don't contain same letters
                    if (lettersDontMatch(words[i], words[j])) {
                        currentProduct = words[i].length() * words[j].length();
                    }

                    if (currentProduct > maxProduct) {
                        maxProduct = currentProduct;
                        maxProductFound = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return maxProduct;
    }

    //firstWord.length() = 1000;  nextWord.length() = 1000
    //firstWord.length() = 1000;  nextWord.length() = 1 ->1000
    //firstWord.length() = 1;  nextWord.length() = 1000 ->1
    public static boolean lettersDontMatch(String firstWord, String nextWord) {

        /*
        Check to see if the letters in both words are different and do not match
         */

        // We want to iterate over the smaller word as there will be less iterations. See comments above.
        // OPTIMIZATION 1!
        String wordToIterate;
        String wordToCompare;
        if (firstWord.length() <= nextWord.length()) {
            wordToIterate = firstWord;
            wordToCompare = nextWord;
        } else {
            wordToIterate = nextWord;
            wordToCompare = firstWord;
        }

        for (Character c : wordToIterate.toCharArray()) {
            if (wordToCompare.indexOf(c) != -1) { // Letter exists
                return false;
            } else { // Letter does not exist
                continue;
            }
        }
        return true;
    }

}
