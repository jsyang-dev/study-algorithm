package me.study.algorithm.codility2.greedy_algorithms.tie_ropes;

public class Solution {

    public int solution(int K, int[] A) {
        int result = 0;
        int subSum = 0;

        for (int length : A) {
            subSum += length;
            if (subSum >= K) {
                result++;
                subSum = 0;
            }
        }

        return result;
    }
}
