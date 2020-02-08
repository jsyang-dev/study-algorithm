package me.study.algorithm.hackerrank.sorting.notifications;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int solution(int[] expenditure, int d) {
        int result = 0;
        SortedMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < d; i++) {
            map.put(expenditure[i], map.getOrDefault(expenditure[i], 0) + 1);
        }

        for (int i = d; i < expenditure.length; i++) {
            int removeIndex = i - d - 1;
            if (removeIndex >= 0) {
                map.put(expenditure[removeIndex], map.get(expenditure[removeIndex]) - 1);
                map.put(expenditure[i - 1], map.getOrDefault(expenditure[i - 1], 0) + 1);
            }

            int range = 0;
            double median = 0;
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                range += entry.getValue();

                // 홀수인 경우
                if (d % 2 == 1) {
                    if (range > d / 2D) {
                        median = entry.getKey();
                        if (expenditure[i] >= median * 2) {
                            result++;
                            break;
                        }
                    }
                }

                // 짝수인 경우
                if (d % 2 == 0) {
                    if (range == d / 2D) {
                        median = (entry.getKey() + iterator.next().getKey()) / 2D;
                        if (expenditure[i] >= median * 2) {
                            result++;
                            break;
                        }
                    }
                    if (range > d / 2D) {
                        median = entry.getKey();
                        if (expenditure[i] >= median * 2) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }
}