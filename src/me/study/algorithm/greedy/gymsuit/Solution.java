package me.study.algorithm.greedy.gymsuit;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Set<Integer> reserveSet = new HashSet<>();

        for (int student : reserve) {
            reserveSet.add(student);
        }

        for (int i = 0; i < lost.length; i++) {
            if (reserveSet.contains(lost[i])) {
                reserveSet.remove(lost[i]);
                lost[i] = -1;
                answer++;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (reserveSet.contains(lost[i] - 1)) {
                reserveSet.remove(lost[i] - 1);
                answer++;
            } else if (reserveSet.contains(lost[i] + 1)) {
                reserveSet.remove(lost[i] + 1);
                answer++;
            }
        }

        return answer;
    }
}