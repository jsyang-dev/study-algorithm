package me.study.algorithm.codility.countingelements.missinginteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] A) {
        int result = 1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int value : A) {
            map.put(value, 0);
        }

        for (int i = 1; i <= 1000000; i++) {
            if (map.get(i) == null) {
                result = i;
                break;
            }
        }

        return result;
    }
}