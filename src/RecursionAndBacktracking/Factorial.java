package RecursionAndBacktracking;

public class Factorial {

    /*
    Write a function factorial which accepts a number and returns the factorial of that number.

    A factorial is the product of an integer and all the integers below it; e.g., factorial four ( 4! ) is equal to 24,
    because 4 * 3 * 2 * 1 equals 24.  factorial zero (0!) is always 1.
     */

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int number){
        if (number == 0) { return 1; }
        return number * factorial(number - 1);

    }

// Number = 0: return 1
// Number = 1: return 1 * 1
// Number = 2: return 2 * 1
// Number = 3: return 3 * 2
// Number = 4: return 4 * 6

}
