package me.study.algorithm.hackerrank.warmup.countingvalleys;

class Solution {
    public int solution(int n, String s) {
        int result = 0;
        int level = 0;

        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);
            if (step == 'U') {
                level++;
                if (level == 0) {
                    result++;
                }
            } else if (step == 'D') {
                level--;
            }
        }

        return result;
    }
}