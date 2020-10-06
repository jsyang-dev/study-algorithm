package me.study.algorithm.programmers.sort.kthnumber;

import java.util.Arrays;

/**
 * [K번째수]
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array;
        int[][] commands;

        array = new int[] {1, 5, 2, 6, 3, 7, 4};
        commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution.solution(array, commands)));
    }
}

