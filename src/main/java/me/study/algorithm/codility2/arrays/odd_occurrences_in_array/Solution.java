package me.study.algorithm.codility2.arrays.odd_occurrences_in_array;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            Integer value = map.getOrDefault(num, 0);
            map.put(num, value ^ 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
