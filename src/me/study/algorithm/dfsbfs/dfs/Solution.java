package me.study.algorithm.dfsbfs.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Solution {
    public String[] solution(Map<String, String[]> graph, String start) {
        List<String> answer = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        
        stack.push(start);
        while (stack.size() > 0) {
            String node = stack.pop();
            if (answer.stream().filter(x -> x.equals(node)).count() == 0) {
                answer.add(node);
                String[] edges = graph.get(node);
                for (String edge : edges) {
                    stack.push(edge);
                }
            }
        }

        return answer.toArray(String[]::new);
    }
}