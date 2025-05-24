package Leetcode;

import java.util.Map;

public class JewelsAndStones {

    /*
    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
    you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have
    are also jewels.

    Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */

    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) return 0;
        int noOfJewels = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.contains(String.valueOf(stone)) ) {
                noOfJewels++;
            }
        }
        return noOfJewels;
    }
}
