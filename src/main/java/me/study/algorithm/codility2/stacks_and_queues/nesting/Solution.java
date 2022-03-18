package me.study.algorithm.codility2.stacks_and_queues.nesting;

import java.util.Stack;

public class Solution {

    public int solution(String S) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                brackets.push(S.charAt(i));
                continue;
            }

            if (brackets.isEmpty()) {
                return 0;
            }
            brackets.pop();
        }

        return brackets.isEmpty() ? 1 : 0;
    }
}
