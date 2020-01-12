package me.study.algorithm.dfsbfs.bfs;

import java.util.*;

class Solution {
    public String[] solution(Map<String, String[]> graph, String start) {
        List<String> answer = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.offer(start);
        while (queue.size() > 0) {
            String node = queue.poll();
            if (answer.stream().filter(x -> x.equals(node)).count() == 0) {
                answer.add(node);
                String[] edges = graph.get(node);
                for (String edge : edges) {
                    queue.offer(edge);
                }
            }
        }

        return answer.toArray(String[]::new);
    }
}