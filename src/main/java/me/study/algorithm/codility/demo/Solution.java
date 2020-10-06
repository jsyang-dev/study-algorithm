package me.study.algorithm.codility.demo;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int seq = 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (A[i] > seq) {
                    break;
                }
                if (i + 1 == A.length || A[i + 1] > seq) {
                    seq++;
                }
            }
        }

        return seq;
    }
}