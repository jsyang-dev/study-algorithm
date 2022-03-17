package me.study.algorithm.codility2.sorting.max_product_of_three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(int[] A) {
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }

        List<Integer> numbers = new ArrayList<>();
        for (int number : A) {
            numbers.add(number);
        }

        Collections.sort(numbers);

        int left = numbers.get(0) * numbers.get(1) * numbers.get(numbers.size() - 1);
        int right = numbers.get(numbers.size() - 3) * numbers.get(numbers.size() - 2) * numbers.get(numbers.size() - 1);
        return Math.max(left, right);
    }
}
