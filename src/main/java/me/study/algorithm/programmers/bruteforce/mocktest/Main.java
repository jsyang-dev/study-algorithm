package me.study.algorithm.programmers.bruteforce.mocktest;

import java.util.Arrays;

/**
 * [모의고사]
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answers;

        answers = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(solution.solution(answers)));

        answers = new int[] {1,3,2,4,2};
        System.out.println(Arrays.toString(solution.solution(answers)));
    }
}