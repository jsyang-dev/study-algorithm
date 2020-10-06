package me.study.algorithm.hackerrank.dynamic.maxarraysum;

class Solution {
    public int solution(int[] arr) {
        int result = Integer.MIN_VALUE;
        int[] sumMax = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (i < 2) {
                sumMax[i] = sum;
            } else if (i == 2) {
                sumMax[i] = sum + sumMax[i - 2];
            } else {
                sumMax[i] = sum + Math.max(sumMax[i - 2], sumMax[i - 3]);
            }

            result = Math.max(result, sumMax[i]);
        }

        return result;
    }
}