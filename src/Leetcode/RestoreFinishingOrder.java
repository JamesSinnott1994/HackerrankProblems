package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RestoreFinishingOrder {

    public static int[] recoverOrder(int[] order, int[] friends) {
        // Given order of IDs representing finishing order in a race
        // Given friends which are a list of IDs in increasing order
        // Return a list representing the friends in their finished order

        // Use a HashSet to store the friends
        // Iterate order
        // Check if current ID is in Hashset
            // If yes, append to recoveredOrder list

        int[] recoveredOrder = new int[friends.length];
        HashSet<Integer> friendsSet = new HashSet<>();
        for (int id : friends) {
            friendsSet.add(id);
        }

        int friend = 0;
        for (int id : order) {
            if (friendsSet.contains(id)) {
                recoveredOrder[friend] = id;
                friend++;
            }
        }
        return recoveredOrder;
    }

}
