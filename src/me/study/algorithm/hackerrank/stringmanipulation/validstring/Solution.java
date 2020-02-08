package me.study.algorithm.hackerrank.stringmanipulation.validstring;

import java.util.*;

class Solution {
    public String solution(String s) {
        String result = "NO";
        Map<Character, Integer> charMap = new HashMap<>();
        SortedMap<Integer, Integer> countMap = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int value : charMap.values()) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        if (countMap.size() == 1) {     // 모든 문자가 동일 갯수인지 확인
            result = "YES";
        } else if (countMap.size() == 2) {
            if (countMap.getOrDefault(1, 0) == 1) {     // 1개인 문자가 한종류인지 확인
                result = "YES";
            } else {
                Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
                Map.Entry<Integer, Integer> entry1 = iterator.next();
                Map.Entry<Integer, Integer> entry2 = iterator.next();

                if (entry1.getKey() + 1 == entry2.getKey() && entry2.getValue() == 1) {   // 1만큼 큰 문자가 1개인지 확인
                    result = "YES";
                }
            }
        }

        return result;
    }
}