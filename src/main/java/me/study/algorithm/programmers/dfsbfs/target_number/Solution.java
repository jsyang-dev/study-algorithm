package me.study.algorithm.programmers.dfsbfs.target_number;

public class Solution {

    private int answer = 0;

    public int solution(int[] numbers, int target) {
        findTarget(numbers, target, 0, 0);
        return answer;
    }

    private void findTarget(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        findTarget(numbers, target, index + 1, sum + numbers[index]);
        findTarget(numbers, target, index + 1, sum - numbers[index]);
    }
}
