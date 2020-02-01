package me.study.algorithm.codility.arrays.oddoccurrencesinrray;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] A) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }
}