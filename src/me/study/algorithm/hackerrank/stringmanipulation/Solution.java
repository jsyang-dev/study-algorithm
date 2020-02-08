package me.study.algorithm.hackerrank.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String a, String b) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            int charCount = map.getOrDefault(b.charAt(i), 0);
            if (charCount == 0) {
                result++;
            } else {
                map.put(b.charAt(i), charCount - 1);
            }
        }

        for (int value : map.values()) {
            result += value;
        }

        return result;
    }
}