package me.study.algorithm.heap.morespicy;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int value : scoville) {
            priorityQueue.offer(value);
        }

        while (priorityQueue.peek() < K) {
            if (priorityQueue.size() == 1) {
                return -1;
            }

            int value1 = priorityQueue.poll();
            int value2 = priorityQueue.poll();
            priorityQueue.offer(value1 + (value2 * 2));

            answer++;
        }

        return answer;
    }
}