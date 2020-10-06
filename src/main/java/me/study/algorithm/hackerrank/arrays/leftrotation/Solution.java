package me.study.algorithm.hackerrank.arrays.leftrotation;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] a, int d) {
        int[] result = new int[a.length];
        int[] arr1 = Arrays.copyOfRange(a, d, a.length);
        int[] arr2 = Arrays.copyOfRange(a, 0, d);

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}