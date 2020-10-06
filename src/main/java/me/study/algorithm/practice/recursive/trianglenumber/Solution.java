package me.study.algorithm.practice.recursive.trianglenumber;

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(triangleNumber(i));
        }
    }

    private static int triangleNumber(int value) {
        if (value == 1) {
            return 1;
        }
        return triangleNumber(value - 1) + value;
    }
}
