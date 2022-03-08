package me.study.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 시간 복잡도: O(n)
 * 공간 복잡도: O(n)
 */
public class TwoSumSolution {

    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        System.out.println(Arrays.toString(twoSumSolution.solution(new int[]{2, 3, 4, 7}, 6)));
    }

    private int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (map.containsKey(numberToFind) && map.get(numberToFind) != i) {
                return new int[] {i, map.get(numberToFind)};
            }
            map.put(numbers[i], i);
        }

        return null;
    }
}
