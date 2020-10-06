package me.study.algorithm.practice.recursive.fibonacci;

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int value) {
        if (value <= 2) {
            return 1;
        }
        return fib(value - 1) + fib(value - 2);
    }
}
