package me.study.algorithm.hackerrank.stacksandqueues.largestrectangle;

import java.util.Stack;

class Solution {
    public long solution(int[] h) {
        long result = 0;
        Stack<Integer> heights = new Stack<>();
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i < h.length; i++) {
            if (heights.isEmpty() || h[i] > heights.peek()) {
                heights.push(h[i]);
                indexes.push(i);
            } else if (h[i] < heights.peek()) {
                int lastIndex = 0;

                while (!heights.isEmpty() && h[i] < heights.peek()) {
                    lastIndex = indexes.pop();
                    int areaSize = heights.pop() * (i - lastIndex);
                    result = Math.max(result, areaSize);
                }

                heights.push(h[i]);
                indexes.push(lastIndex);
            }
        }

        while (!heights.isEmpty()) {
            int areaSize = heights.pop() * (h.length - indexes.pop());
            result = Math.max(result, areaSize);
        }

        return result;
    }
}