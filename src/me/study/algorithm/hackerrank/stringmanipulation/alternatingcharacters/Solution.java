package me.study.algorithm.hackerrank.stringmanipulation.alternatingcharacters;

class Solution {
    public int solution(String s) {
        int result = 0;
        char lastChar = 'Z';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == lastChar) {
                result++;
            } else {
                lastChar = s.charAt(i);
            }
        }

        return result;
    }
}