package me.study.algorithm.practice.graph.bfsdfs;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Graph graph = new Graph(13);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(2, 6);
        graph.addEdge(1, 7);
        graph.addEdge(7, 8);
        graph.addEdge(7, 9);
        graph.addEdge(9, 10);
        graph.addEdge(10, 11);
        graph.addEdge(7, 12);

        System.out.println(graph.bfs(0).toString());
        graph.initVisit();
        System.out.println(graph.dfs(0).toString());
    }

}

class Graph {
    Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node node1 = nodes[i1];
        Node node2 = nodes[i2];
        if (!node1.adjacentList.contains(node2)) {
            node1.adjacentList.add(node2);
        }
        if (!node2.adjacentList.contains(node1)) {
            node2.adjacentList.add(node1);
        }
    }

    void initVisit() {
        for (Node node : nodes) {
            node.visited = false;
        }
    }

    List<Integer> bfs(int start) {
        List<Integer> visit = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        while (!queue.isEmpty()) {
            int nodeNum = queue.poll();
            Node node = nodes[nodeNum];
            if (!node.visited) {
                for (Node adjacent : node.adjacentList) {
                    queue.offer(adjacent.num);
                }
                visit.add(nodeNum);
                node.visited = true;
            }
        }

        return visit;
    }

    List<Integer> dfs(int start) {
        List<Integer> visit = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        while (!stack.isEmpty()) {
            int nodeNum = stack.pop();
            Node node = nodes[nodeNum];
            if (!node.visited) {
                for (Node adjacent : node.adjacentList) {
                    stack.push(adjacent.num);
                }
                visit.add(nodeNum);
                node.visited = true;
            }
        }

        return visit;
    }
}

class Node {
    int num;
    List<Node> adjacentList;
    boolean visited;
    Node(int num) {
        this.num = num;
        this.visited = false;
        adjacentList = new LinkedList<>();
    }
}