package me.study.algorithm.codility2.prime_and_composite_numbers.min_perimeter_rectangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int N) {
        List<Integer> list = new ArrayList<>();
        int mid = (int) Math.floor(Math.sqrt(N));

        for (int i = 1; i <= mid; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        int minPerimeter = Integer.MAX_VALUE;
        for (int num1 : list) {
            int num2 = N / num1;
            minPerimeter = Math.min(minPerimeter, (num1 * 2) + (num2 * 2));
        }

        return minPerimeter;
    }
}
