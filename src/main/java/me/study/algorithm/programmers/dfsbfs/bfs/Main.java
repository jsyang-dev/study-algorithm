package me.study.algorithm.programmers.dfsbfs.bfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * [BFS 예제]
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Map<String, String[]> graph = new HashMap<>();
        String start;

        graph.put("A", new String[] {"B"});
        graph.put("B", new String[] {"A", "C", "H"});
        graph.put("C", new String[] {"B", "D", "G"});
        graph.put("D", new String[] {"C", "E"});
        graph.put("E", new String[] {"D", "F"});
        graph.put("F", new String[] {"E"});
        graph.put("G", new String[] {"C"});
        graph.put("H", new String[] {"B", "I", "J", "M"});
        graph.put("I", new String[] {"H"});
        graph.put("J", new String[] {"H", "K"});
        graph.put("K", new String[] {"J", "L"});
        graph.put("L", new String[] {"K"});
        graph.put("M", new String[] {"H"});
        start = "A";
        System.out.println(Arrays.toString(solution.solution(graph, start)));
    }
}