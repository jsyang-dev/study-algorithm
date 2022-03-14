package me.study.algorithm.codility2.time_complexity.frog_jmp;

public class Solution {

    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        return (int) Math.ceil(distance / (double) D);
    }
}
