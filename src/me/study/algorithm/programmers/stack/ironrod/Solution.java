package me.study.algorithm.programmers.stack.ironrod;

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        int bracket = 0;
        arrangement = arrangement.replace("()", "L");

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                bracket++;
            } else if (arrangement.charAt(i) == ')') {
                bracket--;
                answer++;
            } else if (arrangement.charAt(i) == 'L') {
                answer += bracket;
            }
        }

        return answer;
    }
}
