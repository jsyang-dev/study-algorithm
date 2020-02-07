package me.study.algorithm.hackerrank.hashmaps.frequencyqueries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> solution(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> dataMap = new HashMap<>();

        for (List<Integer> query : queries) {
            int key = query.get(0);
            int value = query.get(1);
            if (key == 1) {
                dataMap.put(value, dataMap.getOrDefault(value, 0) + 1);
            } else if (key == 2) {
                int deleteValue = dataMap.getOrDefault(value, 0);
                if (deleteValue > 0) {
                    dataMap.put(value, deleteValue - 1);
                }
            } else if (key == 3) {
                long count = dataMap.entrySet().stream().filter(entry -> entry.getValue() == value).count();
                if (count > 0) {
                    result.add(1);
                } else {
                    result.add(0);
                }
            }
        }

        return result;
    }
}