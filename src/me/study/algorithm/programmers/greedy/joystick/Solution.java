package me.study.algorithm.programmers.greedy.joystick;

import java.util.stream.IntStream;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int index = 0;
        int mid = ((int)'A' + (int)'Z') / 2;
        int[] complete = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A') {
                complete[i] = 1;
            }
        }

        while (IntStream.of(complete).sum() < name.length()) {
            if (name.charAt(index) != 'A') {
                int ascii = name.charAt(index);
                if (ascii <= mid) {
                    answer += ascii - (int)'A';
                } else {
                    answer += (int)'Z' - ascii + 1;
                }
            }

            complete[index] = 1;
            if (IntStream.of(complete).sum() == name.length()) {
                break;
            }

            int leftMove = 0;
            int left = index;
            int search = 1;
            while (search != 0) {
                left--;
                if (left < 0) {
                    left = name.length() - 1;
                }
                leftMove++;
                search = complete[left];
            }

            int rightMove = 0;
            int right = index;
            search = 1;
            while (search != 0) {
                right++;
                if (right > name.length() - 1) {
                    right = 0;
                }
                rightMove++;
                search = complete[right];
            }

            if (leftMove < rightMove) {
                index = left;
                answer += leftMove;
            } else {
                index = right;
                answer += rightMove;
            }

        }

        return answer;
    }
}