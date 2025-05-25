package Hackerrank;

import java.util.List;

public class StockMaximize {
    public static long stockmax(List<Integer> prices) {
        long currPrice = 0;
        int leftPtr = 0;
        // Get the initial max index
        int currMaxIndex = findMaxIndex(prices, leftPtr, prices.size() - 1);

        // While there is still a max index in the list
        while(currMaxIndex < prices.size()) {
            for(int i = leftPtr; i < currMaxIndex; i++) {
                currPrice += -prices.get(i) + prices.get(currMaxIndex);
            }
            // Get a new max index if it exists
            leftPtr = currMaxIndex + 1;
            currMaxIndex = findMaxIndex(prices, leftPtr, prices.size() - 1);
        }
        return currPrice;
    }

    public static int findMaxIndex(List<Integer> list, int startIndex, int endIndex) {
        int index = startIndex;
        if (startIndex >= list.size()) {
            return list.size();
        }
        for(int i = startIndex; i <= endIndex; i++) {
            if (list.get(i) > list.get(index)) {
                index = i;
            }
        }
        return index;
    }
}