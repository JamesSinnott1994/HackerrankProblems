package MultiplePointersPattern;

public class IsSubsequence {

    public static void main(String[] args) {

//        String wordOne = "hello";
//        String wordTwo = "hello world";
//        System.out.println("isSubsequence: " + isSubsequence(wordOne, wordTwo));

//        String wordOne = "abc";
//        String wordTwo = "acb";
//        System.out.println("isSubsequence: " + isSubsequence(wordOne, wordTwo));

        String wordOne = "acb";
        String wordTwo = "abracadabra";
        System.out.println("isSubsequence: " + isSubsequence(wordOne, wordTwo));
    }

    public static boolean isSubsequence(String wordOne, String wordTwo) {

        int i = 0;
        int j = 0;

        if (wordOne.length() == 0) {
            return true;
        }

        while (j < wordTwo.length()) {

            if (wordTwo.charAt(j) == wordOne.charAt(i)) {
                i++;
            }

            if (i == wordOne.length()) {
                return true;
            }

            j++;
        }

        return false;
    }

}
