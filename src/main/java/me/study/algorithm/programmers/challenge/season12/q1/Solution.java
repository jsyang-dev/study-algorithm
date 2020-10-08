package me.study.algorithm.programmers.challenge.season12.q1;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder ternary = new StringBuilder();

        while (n >= 3) {
            ternary.insert(0, n % 3);
            n = n / 3;
        }
        ternary.insert(0, n);

        int digit = 1;
        for (int i = 0; i < ternary.length(); i++) {
            String num = String.valueOf(ternary.charAt(i));
            answer += Integer.parseInt(num) * digit;
            digit *= 3;
        }

        return answer;
    }
}