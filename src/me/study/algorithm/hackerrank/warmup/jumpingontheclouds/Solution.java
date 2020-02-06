package me.study.algorithm.hackerrank.warmup.jumpingontheclouds;

class Solution {
    public int solution(int[] c) {
        int result = 0;
        int position = 0;

        while (position != c.length - 1) {
            if (position + 2 < c.length && c[position + 2] == 0) {
                position += 2;
            } else if (position + 1 < c.length && c[position + 1] == 0) {
                position++;
            }
            result++;
        }

        return result;
    }
}