package me.study.algorithm.hackerrank.hashmaps.counttriplets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public long solution(List<Long> arr, long r) {
        long result = 0;
        Map<Long, List<Integer>> map = new HashMap<>();

        if (r == 1) {
            return (long) arr.size() * (long) (arr.size() - 1) * (long) (arr.size() - 2) / 6L;
        }

        for (int i = 0; i < arr.size(); i++) {
            Long value = arr.get(i);
            if (value == 1 || value % r == 0) {
                List<Integer> valueIndexes = map.get(value);
                if (valueIndexes == null) {
                    valueIndexes = new ArrayList<>();
                }
                valueIndexes.add(i);
                map.put(value, valueIndexes);
            }
        }

        for (Map.Entry<Long, List<Integer>> entry : map.entrySet()) {
            List<Integer> value1 = entry.getValue();
            List<Integer> value2 = map.get(entry.getKey() * r);
            List<Integer> value3 = map.get(entry.getKey() * r * r);

            if (value2 != null && value3 != null) {
                for (int i = 0; i < value1.size(); i++) {
                    for (int j = 0; j < value2.size(); j++) {
                        for (int k = 0; k < value3.size(); k++) {
                            if (value1.get(i) < value2.get(j) && value2.get(j) < value3.get(k)) {
                                result++;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}