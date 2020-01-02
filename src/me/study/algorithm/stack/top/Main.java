package me.study.algorithm.stack.top;

import java.util.Arrays;

/**
 * [탑]
 * heights는 길이 2 이상 100 이하인 정수 배열입니다.
 * 모든 탑의 높이는 1 이상 100 이하입니다.
 * 신호를 수신하는 탑이 없으면 0으로 표시합니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights;

        heights = new int[] {6,9,5,7,4};
        System.out.println(Arrays.toString(solution.solution(heights)));

        heights = new int[] {3,9,9,3,5,7,2};
        System.out.println(Arrays.toString(solution.solution(heights)));

        heights = new int[] {1,5,3,6,7,6,5}	;
        System.out.println(Arrays.toString(solution.solution(heights)));
    }
}

