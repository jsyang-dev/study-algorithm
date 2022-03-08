package me.study.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 시간 복잡도: O(n2)
 * 공간 복잡도: O(n)
 */
public class ThreeSumSolution {

    public static void main(String[] args) {
        ThreeSumSolution twoSumSolution = new ThreeSumSolution();
        System.out.println(Arrays.toString(twoSumSolution.solution(new int[]{2, 3, 5, 7}, 10)));
    }

    private int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int numberToFind = target - numbers[i] - numbers[j];
                if (map.containsKey(numberToFind) && map.get(numberToFind) != i && map.get(numberToFind) != j) {
                    return new int[] {i, j, map.get(numberToFind)};
                }
            }
            map.put(numbers[i], i);
        }

        return null;
    }
}
