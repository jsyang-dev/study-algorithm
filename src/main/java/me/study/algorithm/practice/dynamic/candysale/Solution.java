package me.study.algorithm.practice.dynamic.candysale;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {0, 100, 400, 800, 900, 1000}, 5));
        System.out.println(maxProfit(new int[] {0, 100, 400, 800, 900, 1000}, 10));
        System.out.println(maxProfit(new int[] {0, 100, 400, 800, 900, 1000, 1400, 1600, 2100, 2200}, 9));
    }

    private static int maxProfit(int[] priceList, int count) {
        Map<Integer, Integer> maxProfitCache = new HashMap<>();

        return maxProfitMemo(priceList, count, maxProfitCache);
    }

    private static int maxProfitMemo(int[] priceList, int count, Map<Integer, Integer> cache) {
        if (count <= 1) {
            return priceList[count];
        }

        if (!cache.containsKey(count)) {
            int max = 0;
            if (count < priceList.length) {
                max = priceList[count];
            }

            for (int i = 1; i <= count / 2; i++) {
                max = Math.max(max, maxProfitMemo(priceList, i, cache) + maxProfitMemo(priceList, count - i, cache));
            }
            cache.put(count, max);
        }

        return cache.get(count);
    }
}