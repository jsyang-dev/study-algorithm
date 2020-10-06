package me.study.algorithm.programmers.challenge.season1.q1;

import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        SortedSet<Integer> answer = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}