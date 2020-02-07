package me.study.algorithm.hackerrank.hashmaps.ransomnote;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] magazine, String[] note) {
        String result = "Yes";
        Map<String, Integer> magazineMap = new HashMap<>();

        for (String key : magazine) {
            magazineMap.put(key, magazineMap.getOrDefault(key, 0) + 1);
        }

        for (String word : note) {
            int wordCnt = magazineMap.getOrDefault(word, 0);
            if (wordCnt == 0) {
                result = "No";
                break;
            }
            magazineMap.put(word, wordCnt - 1);
        }

        return result;
    }
}