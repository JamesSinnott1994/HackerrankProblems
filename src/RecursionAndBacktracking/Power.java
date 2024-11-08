package RecursionAndBacktracking;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }

    public static int power(int base, int exponent) {
        if(exponent == 0) return 1;
        return base * power(base,exponent-1);
    }

    /*
    Start from the base case

    Exponent at 0: return 1
    Exponent at 1: return 2 * 1
    Exponent at 2: return 2 * 2
     */

}
