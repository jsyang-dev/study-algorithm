package me.study.algorithm.hackerrank.greedy.maxmin;

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] arr) {
        int result = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - k + 1; i++) {
            if (arr[i + k - 1] - arr[i] < result) {
                result = arr[i + k - 1] - arr[i];
            }
        }

        return result;
    }
}