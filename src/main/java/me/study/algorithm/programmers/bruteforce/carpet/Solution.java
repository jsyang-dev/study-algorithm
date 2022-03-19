package me.study.algorithm.programmers.bruteforce.carpet;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int brown, int yellow) {
        List<Integer> yellowWidths = new ArrayList<>();

        if (yellow == 1) {
            yellowWidths.add(1);
        } else {
            double mid = Math.sqrt(yellow);
            for (int i = 1; i < mid; i++) {
                if (yellow % i == 0) {
                    yellowWidths.add(i);
                }
            }
        }

        for (int yellowWidth : yellowWidths) {
            int yellowHeight = yellow / yellowWidth;
            int width = yellowWidth + 2;
            int height = yellowHeight + 2;

            if (width * height == brown + yellow) {
                if (yellowWidth + 2 > yellowHeight + 2) {
                    return new int[]{yellowWidth + 2, yellowHeight + 2};
                } else {
                    return new int[]{yellowHeight + 2, yellowWidth + 2};
                }
            }
        }

        return new int[2];
    }
}
