package ProfitablePairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfitablePairs {

    /*
    In a tech company, there are n projects available for the team to work on. Due to
    resource constraints, they can only work on any two of the projects. The expected
    profits for each project are provided in the array, "profit", while the implementation
    costs are given in the array "implementationCost".

    The task is to determine the number of pairs of projects that can be chosen from the
    available options such that the company earns a profit after implementing both projects.
    That is, two projects indexed i and j are chosen if (profit[i] - implementationCost[i])
    + (profit[j] - implementationCost[j]) > 0, where 0 <= i < j < n.

    Constraints:
    1 <= n <= 2 * 10^5
     */

    public static void main(String[] args) {

        List<Integer> profit = new ArrayList<>();
        profit.add(2);
        profit.add(3);
        profit.add(7);
        profit.add(1);
        profit.add(1);

        List<Integer> implementationCost = new ArrayList<>();
        implementationCost.add(3);
        implementationCost.add(4);
        implementationCost.add(5);
        implementationCost.add(1);
        implementationCost.add(2);

        System.out.println("Number of profitable pairs = " + getProfitablePairs(profit, implementationCost));

    }

    public static long getProfitablePairs(List<Integer> profit, List<Integer> implementationCost) {
        /*
        Explanation:
        - Return the number of pairs of projects that generate a profit
        */
        long profitablePairs = 0L;

        List<Integer> netProfit = new ArrayList<>();
        for (int i = 0; i < profit.size(); i++) {
            netProfit.add(profit.get(i) - implementationCost.get(i));
        }
        Collections.sort(netProfit);

        // Two-pointer approach to count pairs
        int n = netProfit.size();
        int j = n - 1;

        for (int i = 0; i < n; i++) {
            // Find the rightmost index where netProfit[i] + netProfit[j] > 0
            while (j > i && netProfit.get(i) + netProfit.get(j) > 0) {
                j--;
            }
            // Count valid pairs
            profitablePairs += (n - 1 - j);
        }

        return profitablePairs;
    }

}
