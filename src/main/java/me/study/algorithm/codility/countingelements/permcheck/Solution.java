package me.study.algorithm.codility.countingelements.permcheck;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        int result = 0;
        Set<Integer> set = new HashSet<>();

        for (int value : A) {
            set.add(value);
        }

        if (Collections.max(set) == A.length && set.size() == A.length) {
            result = 1;
        }

        return result;
    }
}