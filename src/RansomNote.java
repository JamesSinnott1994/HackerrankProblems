import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    /*
    Hash Tables: Ransom Note

    Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his
    handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an
    untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words
    available in the magazine. He cannot use substrings or concatenation to create the words he needs.

    Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note
    exactly using whole words from the magazine; otherwise, print No.

     */

    public static void runFunction() {
        List<String> magazine = new ArrayList<>();
        magazine.add("attack");
        magazine.add("at");
        magazine.add("dawn");

        List<String> note = new ArrayList<>();
        note.add("Attack");
        note.add("at");
        note.add("dawn");

        //checkMagazineMySolution(magazine, note);
        checkMagazineHashmapSolution(magazine, note);
    }

    public static void checkMagazineMySolution(List<String> magazine, List<String> note) {

        // Passed all test cases

        boolean wordsExistInMagazine = true;

        for (String word : note) {
            if (magazine.contains(word)) {
                magazine.remove(word); // Will remove the first instance of the word
            } else {
                wordsExistInMagazine = false;
                System.out.println("No");
                break;
            }
        }

        if (wordsExistInMagazine) {
            System.out.println("Yes");
        }

    }

    public static void checkMagazineHashmapSolution(List<String> magazine, List<String> note) {

        // Passes all test cases

        boolean magazineContainsWords = true;

        Map<String, Integer> magazineWordCount = new HashMap<>();
        for (String word : magazine) {
            magazineWordCount.put(word, magazineWordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : note) {
            if (magazineWordCount.containsKey(word)) {
                if (magazineWordCount.get(word) != 0) {
                    magazineWordCount.put(word, magazineWordCount.get(word) - 1);
                } else {
                    magazineContainsWords = false;
                    break;
                }
            } else {
                magazineContainsWords = false;
                break;
            }
        }

        if (magazineContainsWords) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
