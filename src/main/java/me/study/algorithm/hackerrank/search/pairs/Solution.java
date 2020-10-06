package me.study.algorithm.hackerrank.search.pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int[] arr) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] + k)) {
                result++;
            }
        }

        return result;
    }
}