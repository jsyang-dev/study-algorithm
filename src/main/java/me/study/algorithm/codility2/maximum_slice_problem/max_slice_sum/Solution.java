package me.study.algorithm.codility2.maximum_slice_problem.max_slice_sum;

public class Solution {

    public int solution(int[] A) {
        int maxSum = A[0];
        int subSum = A[0];

        for (int i = 1; i < A.length; i++) {
            subSum = Math.max(subSum + A[i], A[i]);
            maxSum = Math.max(maxSum, subSum);
        }

        return maxSum;
    }
}
