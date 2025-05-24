package Leetcode;

public class ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        if (celsius < 0 || celsius > 1000) {
            throw new IllegalArgumentException("Your input is " + celsius +
                    ". Temperature cannot be below 0 or above 1000");
        }
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
