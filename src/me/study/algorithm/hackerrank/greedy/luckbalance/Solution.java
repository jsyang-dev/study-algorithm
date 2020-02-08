package me.study.algorithm.hackerrank.greedy.luckbalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int k, int[][] contests) {
        int result = 0;
        List<Integer> importantList = new ArrayList<>();

        for (int[] contest : contests) {
            result += contest[0];
            if (contest[1] == 1) {
                importantList.add(contest[0]);
            }
        }

        Collections.sort(importantList);

        int count = importantList.size() - k;
        for (int i = 0; i < count; i++) {
            result -= (importantList.get(i) * 2);
        }

        return result;
    }
}