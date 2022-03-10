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

    void reverse() {

    }
}
