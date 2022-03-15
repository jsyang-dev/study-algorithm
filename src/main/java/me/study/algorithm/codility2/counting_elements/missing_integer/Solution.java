package me.study.algorithm.codility2.counting_elements.missing_integer;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : A) {
            numbers.add(num);
        }

        for (int i = 1; i <= 1_000_000; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
