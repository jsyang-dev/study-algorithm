package me.study.algorithm.heap.ramenfactory;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int nextIndex = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            stock--;
            if (stock == 0) {
                int index = nextIndex;
                if (index < dates.length) {
                    while (dates[index] <= i + 1) {
                        priorityQueue.offer(supplies[index]);
                        index++;
                        if (index >= dates.length) {
                            break;
                        }
                    }
                }
                nextIndex = index;
                stock = priorityQueue.poll();
                answer++;
            }
        }
        return answer;
    }
}