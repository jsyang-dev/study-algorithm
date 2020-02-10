package me.study.algorithm.practice.dynamic.fibonacci2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fibTab(10));
        System.out.println(fibTab(50));
    }

    private static long fibTab(int n) {
        long curr = 0L;
        long prev = 0L;

        for (int i = 1; i <= n; i++) {
            if (i <= 2) {
                prev = curr;
                curr = 1L;
            } else {
                long temp = curr;
                curr = curr + prev;
                prev = temp;
            }
        }

        return curr;
    }
}