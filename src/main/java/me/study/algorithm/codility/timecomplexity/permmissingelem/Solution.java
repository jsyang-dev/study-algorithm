package me.study.algorithm.codility.timecomplexity.permmissingelem;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int result = 0;

        if ( A.length == 0) {
            return 1;
        }

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                result = i + 1;
                break;
            }
        }

        return result == 0 ? A.length + 1 : result;
    }
}