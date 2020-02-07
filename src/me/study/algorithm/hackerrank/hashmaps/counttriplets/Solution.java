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
            long times = 0;
            if (entry.getKey() > 1) {
                // r로 몇번 나누면 1이 되는 수인지
            }
        }

        return result;
    }
}