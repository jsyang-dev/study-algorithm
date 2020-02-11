package me.study.algorithm.programmers.challenge.k2019q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>();
        Map<String, String> nickMap = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] row = record[i].split(" ");
            if ("Enter".equals(row[0]) || "Change".equals(row[0])) {
                nickMap.put(row[1], row[2]);
            }
        }

        for (String item : record) {
            String[] splitItem = item.split(" ");
            if ("Enter".equals(splitItem[0])) {
                result.add(nickMap.get(splitItem[1]) + "님이 들어왔습니다.");
            } else if ("Leave".equals(splitItem[0])) {
                result.add(nickMap.get(splitItem[1]) + "님이 나갔습니다.");
            }
        }

        return result.toArray(String[]::new);
    }
}