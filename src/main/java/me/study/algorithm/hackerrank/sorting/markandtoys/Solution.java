package me.study.algorithm.hackerrank.sorting.markandtoys;

import java.util.Arrays;

class Solution {
    public int solution(int[] prices, int k) {
        int result = 0;
        int sum = 0;

        Arrays.sort(prices);

        for (int price : prices) {
            if (sum + price > k) {
                break;
            }
            sum += price;
            result++;
        }

        return result;
    }
}