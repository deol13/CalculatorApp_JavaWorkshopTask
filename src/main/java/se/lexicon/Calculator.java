package se.lexicon;

import java.util.List;

public class Calculator {
    public static double addition(List<Double> nums){
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double subtraction(List<Double> nums){
        double sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            sum -= nums.get(i);
        }
        return sum;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
}
