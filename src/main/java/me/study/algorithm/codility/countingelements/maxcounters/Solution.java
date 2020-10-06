package me.study.algorithm.codility.countingelements.maxcounters;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int currentMax = 0;
        int lastMax = 0;

        for (int value : A) {
            if (value == N + 1) {
                lastMax = currentMax;
            } else {
                if (result[value - 1] < lastMax) {
                    result[value - 1] = lastMax + 1;
                } else {
                    result[value - 1]++;
                }

                if (result[value - 1] > currentMax) {
                    currentMax = result[value - 1];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < lastMax) {
                result[i] = lastMax;
            }
        }

        return result;
    }
}