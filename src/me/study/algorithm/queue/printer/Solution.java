package me.study.algorithm.queue.printer;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int seq = 1;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {priorities[i], i});
        }

        while (answer == 0) {
            int[] document = queue.poll();
            boolean maxDocument = true;

            for (int[] item: queue) {
                if (item[0] > document[0]) {
                    queue.offer(document);
                    maxDocument = false;
                    break;
                }
            }

            if (maxDocument) {
                if (document[1] == location) {
                    answer = seq;
                }
                seq++;
            }
        }

        return answer;
    }
}