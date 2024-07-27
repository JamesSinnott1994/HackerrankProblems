package RecursionAndBacktracking;

import java.util.Scanner;

public class Fibonacci {

    public static void runFibonacciChallenge() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println(fibonacci(n));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
