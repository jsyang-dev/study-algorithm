package me.study.algorithm.practice.divideandconquer.consecutivesum;

public class Solution {
    public static void main(String[] args) {
        System.out.println(consecutiveSum(1, 10));
        System.out.println(consecutiveSum(1, 100));
        System.out.println(consecutiveSum(1, 253));
        System.out.println(consecutiveSum(1, 388));
    }

    private static int consecutiveSum(int start, int end) {
        if (start == end) {
            return start;
        }

        int mid = (start + end) / 2;
        return consecutiveSum(start, mid) + consecutiveSum(mid + 1, end);
    }
}
