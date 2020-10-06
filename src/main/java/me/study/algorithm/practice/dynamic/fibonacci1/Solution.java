package me.study.algorithm.practice.dynamic.fibonacci1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(50));
    }

    private static long fib(int n) {
        Map<Integer, Long> fibCache = new HashMap<>();

        return fibMemo(n, fibCache);
    }

    private static long fibMemo(int n, Map<Integer, Long> fibCache) {
        if (n <= 2) {
            return 1;
        }

        if (!fibCache.containsKey(n)) {
            long fibNum = fibMemo(n - 1, fibCache) + fibMemo(n - 2, fibCache);
            fibCache.put(n, fibNum);
        }
        return fibCache.get(n);
    }
}