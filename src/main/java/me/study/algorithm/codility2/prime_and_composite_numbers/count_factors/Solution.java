package me.study.algorithm.codility2.prime_and_composite_numbers.count_factors;

public class Solution {

    public int solution(int N) {
        if (N == 1) {
            return 1;
        }

        int result = 0;
        double mid = Math.sqrt(N);

        for (int i = 1; i < mid; i++) {
            if (N % i == 0) {
                result++;
            }
        }

        if (Math.floor(mid) == mid) {
            return result * 2 + 1;
        }
        return result * 2;
    }
}
