package me.study.algorithm.codility2.counting_elements.max_counters;

public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int lastMaxCounter = 0;
        int max = 0;

        for (int num : A) {
            if (num == N + 1) {
                lastMaxCounter = max;
            } else {
                if (counters[num - 1] < lastMaxCounter) {
                    counters[num - 1] = lastMaxCounter + 1;
                } else {
                    counters[num - 1]++;
                }
                max = Math.max(max, counters[num - 1]);
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastMaxCounter) {
                counters[i] = lastMaxCounter;
            }
        }

        return counters;
    }
}
