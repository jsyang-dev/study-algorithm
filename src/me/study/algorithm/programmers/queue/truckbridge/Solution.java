package me.study.algorithm.programmers.queue.truckbridge;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>();

        int index = 1;
        int truckWeightsSum = truck_weights[0];
        queue.offer(truck_weights[0]);
        while (truckWeightsSum > 0) {
            if (queue.size() == bridge_length) {
                truckWeightsSum -= queue.poll();
            }

            if (index < truck_weights.length && truckWeightsSum + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                truckWeightsSum += truck_weights[index];
                index++;
            } else {
                queue.offer(0);
            }

            answer++;
        }

        return answer;
    }
}
