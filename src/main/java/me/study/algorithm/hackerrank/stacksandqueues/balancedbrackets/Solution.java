package me.study.algorithm.hackerrank.stacksandqueues.balancedbrackets;

import java.util.Stack;

class Solution {
    public String solution(String s) {
        String result = "NO";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                // 비교할 괄호가 없음
                if (stack.isEmpty()) {
                    break;
                }

                char popBracket = stack.pop();
                // 괄호 짝이 안맞음
                if ((popBracket == '(' && bracket != ')') || (popBracket == '{' && bracket != '}') || (popBracket == '[' && bracket != ']')) {
                    break;
                }
            }

            // 마지막까지 확인후 정상 여부 판단
            if (i == s.length() - 1 && stack.isEmpty()) {
                result = "YES";
            }
        }

        return result;
    }
}