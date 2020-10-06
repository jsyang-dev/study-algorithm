package me.study.algorithm.codility.timecomplexity.tapeequilibrium;

class Solution {
    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for (int value : A) {
            right += value;
        }

        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];

            int diff = Math.abs(left - right);
            if (diff < result) {
                result = diff;
            }
        }

        return result;
    }
}