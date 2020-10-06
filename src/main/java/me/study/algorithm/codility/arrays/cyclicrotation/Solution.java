package me.study.algorithm.codility.arrays.cyclicrotation;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        int[] result = Arrays.copyOf(A, A.length);

        for (int i = 0; i < K; i++) {
            int temp = result[result.length - 1];
            for (int j = result.length - 1; j > 0; j--) {
                result[j] = result[j - 1];
            }
            result[0] = temp;
        }

        return result;
    }
}