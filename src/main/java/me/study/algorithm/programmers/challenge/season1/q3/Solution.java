package me.study.algorithm.programmers.challenge.season1.q3;

import java.util.HashSet;
import java.util.LinkedList;

class Solution {
    HashSet<Integer> answer = new HashSet<>();

    public int solution(int[] a) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int num: a) {
            list.add(num);
        }

        for (int cnt = -1; cnt < list.size() - 1; cnt++) {
            LinkedList<Integer> subList = new LinkedList<>(list);
            process(subList, cnt);
        }

        return answer.size();
    }

    void process(LinkedList<Integer> list, int cnt) {
        if (list.size() == 1) {
            answer.add(list.get(0));
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (cnt == 0) {
                if (list.get(i) < list.get(i + 1)) {
                    list.remove(i);
                } else {
                    list.remove(i + 1);
                }
            } else {
                if (list.get(i) > list.get(i + 1)) {
                    list.remove(i);
                } else {
                    list.remove(i + 1);
                }
            }

            LinkedList<Integer> subList = new LinkedList<>(list);
            process(subList, cnt - 1);
        }
    }
}