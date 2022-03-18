package me.study.algorithm.codility2.stacks_and_queues.fish;

import java.util.Stack;

public class Solution {

    public int solution(int[] A, int[] B) {
        Stack<Integer> powersOfDownStreams = new Stack<>();
        int survivedUpStreamFish = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                while (!powersOfDownStreams.isEmpty()) {
                    int powerOfDownStream = powersOfDownStreams.pop();
                    if (powerOfDownStream > A[i]) {
                        powersOfDownStreams.push(powerOfDownStream);
                        break;
                    }
                }
                if (powersOfDownStreams.isEmpty()) {
                    survivedUpStreamFish++;
                }
            } else {
                powersOfDownStreams.push(A[i]);
            }
        }

        return survivedUpStreamFish + powersOfDownStreams.size();
    }
}
