package me.study.algorithm.hackerrank.search.icecreamparlor;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] cost, int money) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        // Map에 차례대로 넣는다, 중복값이 있어도 결국 두번째 인덱스가 남게 됨
        for (int i = 0; i < cost.length; i++) {
            map.put(cost[i], i);
        }

        for (int i = 0; i < cost.length; i++) {
            int remain = money - cost[i];
            // Sunny가 쓰고 남은 돈에 일치하는 맛이 있는지 검색(현재 인덱스 제외)
            if (map.containsKey(remain) && map.get(remain) != i) {
                result[0] = i + 1;
                result[1] = map.get(remain) + 1;
                break;
            }
        }

        System.out.println(result[0] + " " + result[1]);

        return result;
    }
}