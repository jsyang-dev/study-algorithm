package me.study.algorithm.codility2.stacks_and_queues.brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public int solution(String S) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);
            if (bracketMap.containsKey(bracket)) {
                brackets.push(bracket);
            } else {
                if (brackets.isEmpty()) {
                    return 0;
                }

                Character openingBracket = brackets.pop();
                if (bracketMap.get(openingBracket) != bracket) {
                    return 0;
                }
            }
        }

        return brackets.isEmpty() ? 1 : 0;
    }
}
