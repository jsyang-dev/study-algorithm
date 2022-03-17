package me.study.algorithm.codility2.sorting.distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {
        Set<Integer> numbers = new HashSet<>();

        for (int number : A) {
            numbers.add(number);
        }

        return numbers.size();
    }
}
