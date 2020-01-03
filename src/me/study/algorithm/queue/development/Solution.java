package me.study.algorithm.queue.development;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] success = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            success[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int deploymentCnt = 1;
        int successMax = success[0];
        for (int i = 0; i < success.length; i++) {
            if (i == success.length - 1) {
                answer.add(deploymentCnt);
                break;
            }

            if (success[i + 1] > successMax) {
                answer.add(deploymentCnt);
                successMax = success[i + 1];
                deploymentCnt = 0;
            }

            deploymentCnt++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
