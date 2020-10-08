package me.study.algorithm.programmers.challenge.season12.q2;

class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int size = arr.length;
        int x = 0, y = 0;

        for (int i = size; i >= 2; i = i / 2) {
            while (x < size && y < size) {

                if (arr[x][y] == -1) {
                    continue;
                }

                int value = arr[x][y];
                loop:
                for (int row = x; row < x + i; row++) {
                    for (int col = y; col < y + i; col++) {
                        if (arr[row][col] != value) {
                            value = -1;
                            break loop;
                        }
                    }
                }

                if (value != -1) {
                    if (value == 0) {
                        answer[0]++;
                    } else if (value == 1) {
                        answer[1]++;
                    }
                    for (int row = x; row < x + i; row++) {
                        for (int col = y; col < y + i; col++) {
                            arr[row][col] = -1;
                        }
                    }
                }

                if (y + i < size) {
                    y += i;
                } else {
                    y = 0;
                    x += i;
                }
            }

            x = 0;
            y = 0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == 0) {
                    answer[0]++;
                } else if (arr[i][j] == 1) {
                    answer[1]++;
                }
            }
        }

        return answer;
    }
}