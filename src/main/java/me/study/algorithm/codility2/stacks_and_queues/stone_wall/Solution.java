package me.study.algorithm.codility2.stacks_and_queues.stone_wall;

import java.util.Stack;

public class Solution {

    public int solution(int[] H) {
        Stack<Integer> heights = new Stack<>();
        int result = 0;

        for (int height : H) {
            if (heights.isEmpty()) {
                heights.push(height);
                continue;
            }

            while (heights.peek() > height) {
                heights.pop();
                result++;

                if (heights.isEmpty()) {
                    heights.push(height);
                }
            }

            if (heights.peek() < height) {
                heights.push(height);
            }
        }

        return result + heights.size();
    }
}
