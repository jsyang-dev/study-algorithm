package me.study.algorithm.codility2.arrays.cyclic_rotation;

public class Solution {

    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K % A.length == 0) {
            return A;
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + K) % A.length;
            result[newIndex] = A[i];
        }

        return result;
    }
}
