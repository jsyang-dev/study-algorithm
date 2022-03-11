package me.study.algorithm.inflearn.list;

public class LinkedListSolution {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new LinkedNode(1));
        linkedList.add(new LinkedNode(2));
        linkedList.add(new LinkedNode(3));

        linkedList.print();
        linkedList.reverse1();
        linkedList.print();
        linkedList.reverse2();
        linkedList.print();
    }
}
