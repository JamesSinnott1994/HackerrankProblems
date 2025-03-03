package SummingQuestions;

public class ScoreOfString {

    public static void main(String[] args) {

        String s = "hello";
        System.out.println("Score of string is: " + scoreOfString(s));

    }

    public static int scoreOfString(String s) {

        /*
        Time Complexity is O(n)
        Space Complexity is O(1)
         */

        // Iterate through string character by character
        // Get ASCII value of each character
        // Get absolute difference between the ASCII values of adjacent characters
        // Sum them up to get the score

        // Two pointer solution
        int i = 0;
        int j = 1;
        int score = 0;

        while (j <= s.length()-1) {
            // Get ASCII Value of each character and get absolute difference
            int firstCharAscii = s.charAt(i);
            int secondCharAscii = s.charAt(j);
            score += Math.abs(firstCharAscii - secondCharAscii);
            i++;
            j++;
        }
        return score;
    }

}
