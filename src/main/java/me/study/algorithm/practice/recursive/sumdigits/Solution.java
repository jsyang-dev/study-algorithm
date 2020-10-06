package me.study.algorithm.practice.recursive.sumdigits;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigits("22541"));
        System.out.println(sumDigits("92130"));
        System.out.println(sumDigits("12634"));
        System.out.println(sumDigits("704"));
        System.out.println(sumDigits("3755"));
    }

    private static int sumDigits(String value) {
        if (value.length() == 1) {
            return Integer.parseInt(value);
        }
        return sumDigits(value.substring(0, 1)) + sumDigits(value.substring(1));
    }
}
