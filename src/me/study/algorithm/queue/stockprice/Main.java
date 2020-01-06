package me.study.algorithm.queue.stockprice;

import java.util.Arrays;

/**
 * [주식가격]
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2 이상 100,000 이하입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices;

        prices = new int[] {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution.solution(prices)));
    }
}

