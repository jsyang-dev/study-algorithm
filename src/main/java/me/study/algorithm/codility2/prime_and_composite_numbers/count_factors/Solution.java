package me.study.algorithm.codility2.prime_and_composite_numbers.count_factors;

public class Solution {

    public int solution(int N) {
        if (N == 1) {
            return 1;
        }

        int result = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                result++;
            }
        }

        return result + 1;
    }
}
