package me.study.algorithm.hackerrank.hashmaps.anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();

        // 가능한 모든 key를 맵에 넣는다
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String[] keys = s.substring(i, j).split("");
                Arrays.sort(keys);
                String key = String.join("", keys);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result += (entry.getValue() * (entry.getValue() - 1) / 2);
            }
        }

        return result;
    }
}