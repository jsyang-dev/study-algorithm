package me.study.algorithm.codility2.sorting.number_of_disc_intersections;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int solution(int[] A) {
        long[][] ranges = new long[A.length][2];

        for (int i = 0; i < A.length; i++) {
            ranges[i][0] = (long) i - A[i];
            ranges[i][1] = (long) i + A[i];
        }

        Arrays.sort(ranges, Comparator.comparingLong((long[] o) -> o[0]).thenComparingLong(o -> o[1]));

        int result = 0;
        for (int i = 0; i < ranges.length - 1; i++) {
            for (int j = i + 1; j < ranges.length; j++) {
                if (ranges[j][0] <= ranges[i][1]) {
                    result++;
                }
            }
        }

        return result > 10_000_000 ? -1 : result;
    }
}
