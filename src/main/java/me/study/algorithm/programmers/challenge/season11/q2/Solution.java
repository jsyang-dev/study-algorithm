package me.study.algorithm.programmers.challenge.season11.q2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        if (n == 1) {
            return new int[]{1};
        }

        List<Integer> answer = new ArrayList<>();
        int[][] arr = new int[n][n];
        int seq = 1;
        int x = 0, y = 0;
        String direction = "down";
        boolean finished = false;

        while (!finished) {

            arr[x][y] = seq;

            switch (direction) {
                case "down":
                    if (x + 1 >= n || arr[x + 1][y] > 0) {
                        direction = "right";
                        y++;
                    } else {
                        x++;
                    }
                    break;
                case "right":
                    if (y + 1 >= n || arr[x][y + 1] > 0) {
                        direction = "up";
                        x--;
                        y--;
                    } else {
                        y++;
                    }
                    break;
                case "up":
                    if (arr[x - 1][y - 1] > 0) {
                        direction = "down";
                        x++;
                    } else {
                        x--;
                        y--;
                    }
                    break;
            }

            if (arr[x][y] != 0) {
                finished = true;
            }

            seq++;
        }

        for (int[] row : arr) {
            for (int value : row) {
                if (value != 0) {
                    answer.add(value);
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}