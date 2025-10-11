package Leetcode;

public class FindClosestPerson {

    public static int findClosest(int x, int y, int z) {

        int xDistance = Math.abs(z - x);
        int yDistance = Math.abs(z - y);

        if (xDistance > yDistance)
            return 2;
        else if (xDistance < yDistance)
            return 1;
        else
            return 0;
    }

}
