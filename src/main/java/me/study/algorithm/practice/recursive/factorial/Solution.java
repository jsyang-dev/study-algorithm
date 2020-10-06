package me.study.algorithm.practice.recursive.factorial;

public class Solution {
    public static void main(String[] args) {
        int value = 5;
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        System.out.println(result);

        System.out.println(factorial(value));
    }

    private static int factorial(int value) {
        if (value == 0) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
