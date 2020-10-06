package me.study.algorithm.programmers.bruteforce.mocktest;

import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[][] pattern = new int[][] {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] correct = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                int index = i % pattern[j].length;
                if (answers[i] == pattern[j][index]) {
                    correct[j]++;
                }
            }
        }

        OptionalInt max = Arrays.stream(correct).max();
        int index = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max.getAsInt()) {
                answer[index] = i + 1;
                index++;
            }
        }

        return Arrays.stream(answer).filter(x -> x > 0).toArray();
    }
}

