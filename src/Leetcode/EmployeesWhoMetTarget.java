package Leetcode;

public class EmployeesWhoMetTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // Have variable called employeesWhoMetTarget
        // Iterate over array hours
        // For each employee, determine if hours worked is >= target
            // If equal increment employeesWhoMetTarget

        int employeesWhoMetTarget = 0;
        for (int hour : hours) {
            if (hour >= target) {
                employeesWhoMetTarget++;
            }
        }
        return employeesWhoMetTarget;
    }

}
