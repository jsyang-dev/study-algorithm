package me.study.algorithm.codility2.sorting.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(int[] A) {
        List<Long> numbers = new ArrayList<>();
        for (int number : A) {
            numbers.add((long) number);
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size() - 2; i++) {
            if (numbers.get(i) + numbers.get(i + 1) > numbers.get(i + 2)) {
                return 1;
            }
        }
        return 0;
    }
}
