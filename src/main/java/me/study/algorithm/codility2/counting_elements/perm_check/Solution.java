package me.study.algorithm.codility2.counting_elements.perm_check;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }

        return 1;
    }
}
