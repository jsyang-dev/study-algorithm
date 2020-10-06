package me.study.algorithm.hackerrank.greedy.absolutedifference;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int result = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < result) {
                result = diff;
            }
        }

        return result;
    }
}