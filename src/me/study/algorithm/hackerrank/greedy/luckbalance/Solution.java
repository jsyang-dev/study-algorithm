package me.study.algorithm.hackerrank.greedy.luckbalance;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

class Solution {
    public int solution(int k, int[][] contests) {
        int result = 0;
        SortedMap<Integer, Integer> importantMap = new TreeMap<>();

        for (int[] contest : contests) {
            result += contest[0];
            if (contest[1] == 1) {
                importantMap.put(contest[0], contest[1]);
            }
        }

        int count = importantMap.size() - k;
        Iterator<Integer> iterator = importantMap.keySet().iterator();
        while (count > 0) {
            result -= (iterator.next() * 2);
            count--;
        }

        return result;
    }
}