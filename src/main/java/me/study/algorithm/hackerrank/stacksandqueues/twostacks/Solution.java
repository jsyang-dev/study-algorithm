package me.study.algorithm.hackerrank.stacksandqueues.twostacks;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    private static class MyQueue<T> {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> subStack = new Stack<>();

        public void enqueue(int value) {
            stack.push(value);
        }

        public void dequeue() {
            move(stack, subStack);
            subStack.pop();
            move(subStack, stack);
        }

        public int peek() {
            move(stack, subStack);
            int value = subStack.peek();
            move(subStack, stack);

            return value;
        }

        private void move(Stack<Integer> stack, Stack<Integer> subStack) {
            while (!stack.isEmpty()) {
                subStack.push(stack.pop());
            }
        }
    }
}