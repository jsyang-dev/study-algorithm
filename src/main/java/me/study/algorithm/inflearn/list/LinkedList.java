package me.study.algorithm.inflearn.list;

public class LinkedList {

    LinkedNode head;
    LinkedNode tail;

    void print() {
        LinkedNode nodeToPrint = head;
        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    void reverse1() {
        LinkedNode current = head;
        LinkedNode prev = null;

        while (current != null) {
            LinkedNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        tail = head;
        head = prev;
    }

    void reverse2() {
        LinkedNode head = this.head;
        this.head = recursiveReverse(head);
        this.tail = head;
    }

    private LinkedNode recursiveReverse(LinkedNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LinkedNode newHead = recursiveReverse(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }
}
