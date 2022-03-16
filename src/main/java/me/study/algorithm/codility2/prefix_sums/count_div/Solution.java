package me.study.algorithm.codility2.prefix_sums.count_div;

public class Solution {

    public int solution(int A, int B, int K) {
        int start = -1;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                start = i;
                break;
            }
        }

        if (start == -1) {
            return 0;
        }

        return (int) Math.ceil((B - start + 1) * (1 / (double) K));
    }
}
