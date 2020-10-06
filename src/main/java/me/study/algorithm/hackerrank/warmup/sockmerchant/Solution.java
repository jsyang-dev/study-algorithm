package me.study.algorithm.hackerrank.warmup.sockmerchant;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] ar) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : ar) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.get(key) == 2) {
                result++;
                map.put(key, 0);
            }
        }

        return result;
    }
}