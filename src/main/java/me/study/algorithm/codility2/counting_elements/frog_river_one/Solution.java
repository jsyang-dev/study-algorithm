package me.study.algorithm.codility2.counting_elements.frog_river_one;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int X, int[] A) {
        Set<Integer> checkSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            checkSet.add(A[i]);
            if (checkSet.size() == X) {
                return i;
            }
        }

        return -1;
    }
}
