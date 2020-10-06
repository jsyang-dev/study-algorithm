package me.study.algorithm.programmers.sort.largestnumber;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numbersStr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numbersStr, (o1, o2) -> {
            int compare = (o1 + o2).compareTo(o2 + o1);
            if (compare < 0) {
                return 1;
            } else if (compare > 0) {
                return -1;
            }
            return 0;
        });
        answer = Arrays.toString(numbersStr).replaceAll("[^0-9]", "");
        return new DecimalFormat("0").format(new BigDecimal(answer));
    }
}