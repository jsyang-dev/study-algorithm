package me.study.algorithm.hackerrank.greedy.florist;

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] c) {
        int result = 0;
        int[] multiply = new int[k];
        int curMultiply = 0;

        Arrays.sort(c);

        for (int i = c.length - 1; i >= 0; i--) {
            result += (multiply[curMultiply] + 1) * c[i];
            multiply[curMultiply]++;
            curMultiply = ++curMultiply % k;
        }

        return result;
    }
}