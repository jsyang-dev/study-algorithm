package me.study.algorithm.sort.hindex;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = -1;

        Integer[] citationsInt = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citationsInt, Collections.reverseOrder());

        for (int i = citationsInt[0]; i >= 0; i--) {
            int hindex = i;
            long graterCount = Arrays.stream(citationsInt).filter(x -> x >= hindex).count();
            if (graterCount >= hindex) {
                return hindex;
            }
        }

        return answer;
    }
}