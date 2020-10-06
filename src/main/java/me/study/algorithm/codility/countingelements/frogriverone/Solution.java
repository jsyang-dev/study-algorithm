package me.study.algorithm.codility.countingelements.frogriverone;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            set.add(value);
            if (set.size() == X) {
                result = i;
                break;
            }
        }

        return result;
    }
}