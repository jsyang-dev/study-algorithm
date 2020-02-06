package me.study.algorithm.programmers.bruteforce.primenumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    Set<Integer> resultSet = new HashSet<>();

    public int solution(String numbers) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < numbers.length(); i++) {
            list.add(String.valueOf(numbers.charAt(i)));
        }

        for (int i = 0; i < numbers.length(); i++) {
            makeNumber(list, i + 1, new ArrayList<>());
        }

        return resultSet.size();
    }

    private void makeNumber(List<String> list, int digit, List<String> result) {
        if (digit == 0) {
            int number = Integer.parseInt(String.join("", result));
            if (number <= 1) {
                return;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return;
                }
            }
            resultSet.add(number);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            List<String> newList = new ArrayList<>();
            newList.addAll(list);

            List<String> newResult = new ArrayList<>();
            newResult.addAll(result);

            String number = newList.get(i);
            newResult.add(number);
            newList.remove(i);
            makeNumber(newList, digit - 1, newResult);
        }
    }
}

