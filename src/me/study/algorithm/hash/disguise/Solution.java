package me.study.algorithm.hash.disguise;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] item : clothes) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        if (map.size() == 1) {
            return clothes.length;
        }

        for (Integer integer : map.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
