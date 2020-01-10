package me.study.algorithm.heap.ramenfactory;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i <= k; i++) {
            stock--;
            // 다음날 이전까지 큐에 추가 while
            // 내큐에서 꺼낸다
        }

        return answer;
    }
}