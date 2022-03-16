package me.study.algorithm.codility2.prefix_sums.min_avg_two_slice;

public class Solution {

    public int solution(int[] A) {
        float minAvg = Float.MAX_VALUE;
        int min = 0;

        for (int i = 0; i < A.length - 1; i++) {
            int count = 1;
            int sum = A[i];
            for (int j = i + 1; j < A.length; j++) {
                count++;
                sum += A[j];
                if (sum / (float) count < minAvg) {
                    minAvg = sum / (float) count;
                    min = i;
                }
            }
        }

        return min;
    }
}
