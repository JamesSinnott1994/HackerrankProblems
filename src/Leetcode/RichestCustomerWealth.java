package Leetcode;

public class RichestCustomerWealth {

    /*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
    ith customer has in the jth bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.
     */

    public static void main(String[] args) {

        // Iterate through each customer
        // Iterate through their banks and sum their total wealth
        // Return richest
        RichestCustomerWealth rcw = new RichestCustomerWealth();
        int[][] accounts = {{1, 2, 3}, {3, 2, 2}};
        System.out.println(rcw.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] banks : accounts) {
            int sumOfWealth = 0;
            for (int bank : banks) {
                sumOfWealth += bank;
            }
            if (sumOfWealth > maxWealth) {
                maxWealth = sumOfWealth;
            }
        }
        return maxWealth;
    }

}
