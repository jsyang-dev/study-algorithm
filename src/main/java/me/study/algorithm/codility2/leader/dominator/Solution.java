package me.study.algorithm.codility2.leader.dominator;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        Map<Integer, Integer> counters = new HashMap<>();
        Map<Integer, Integer> lastIndexes = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int number = A[i];
            int count = counters.getOrDefault(A[i], 0);
            counters.put(number, count + 1);
            lastIndexes.put(number, i);
        }

        int maxNumber = 0;
        int maxCount = 0;
        boolean duplicated = false;
        for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxNumber = entry.getKey();
                maxCount = entry.getValue();
                duplicated = false;
            } else if (entry.getValue() == maxCount) {
                duplicated = true;
            }
        }

        if (duplicated || counters.get(maxNumber) <= A.length / 2) {
            return -1;
        }
        return lastIndexes.get(maxNumber);
    }
}
