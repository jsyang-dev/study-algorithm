package me.study.algorithm.codility2.maximum_slice_problem.max_profit;

public class Solution {

    public int solution(int[] A) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : A) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
