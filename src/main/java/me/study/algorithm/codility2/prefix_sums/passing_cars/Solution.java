package me.study.algorithm.codility2.prefix_sums.passing_cars;

public class Solution {

    public int solution(int[] A) {
        int pairs = 0;
        int eastCount = 0;

        for (int car : A) {
            if (car == 0) {
                eastCount++;
            } else {
                pairs += eastCount;
                if (pairs > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return pairs;
    }
}
