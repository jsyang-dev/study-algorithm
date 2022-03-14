package me.study.algorithm.codility2.time_complexity.perm_missing_elem;

public class Solution {

    public int solution(int[] A) {
        boolean[] check = new boolean[A.length + 1];

        for (int num : A) {
            check[num - 1] = true;
        }

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
