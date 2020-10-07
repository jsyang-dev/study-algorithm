package me.study.algorithm.programmers.challenge.season1.q3;

import java.util.HashSet;

class Solution {
    public int solution(int[] a) {
        HashSet<Integer> answer = new HashSet<>();
        int leftMin = 1000000000;
        int rightMin = 1000000000;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < leftMin) {
                answer.add(a[i]);
                leftMin = a[i];
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < rightMin) {
                answer.add(a[i]);
                rightMin = a[i];
            }
        }

        return answer.size();
    }
}