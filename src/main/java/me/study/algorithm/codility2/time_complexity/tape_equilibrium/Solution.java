package me.study.algorithm.codility2.time_complexity.tape_equilibrium;

public class Solution {

    public int solution(int[] A) {
        int minGap = Integer.MAX_VALUE;

        int leftSum = 0;
        int rightSum = 0;
        for (int num : A) {
            rightSum += num;
        }

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int gap = Math.abs(leftSum - rightSum);
            if (gap < minGap) {
                minGap = gap;
            }
        }

        return minGap;
    }
}
