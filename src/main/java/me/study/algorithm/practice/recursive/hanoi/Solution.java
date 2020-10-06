package me.study.algorithm.practice.recursive.hanoi;

public class Solution {
    public static void main(String[] args) {
        hanoi(3, 1, 3);
    }

    private static void moveDisk(int diskNum, int startPeg, int endPeg) {
        System.out.printf("%d번 원판을 %d번 기둥에서 %d번 기둥으로 이동\n", diskNum, startPeg, endPeg);
    }

    private static void hanoi(int disks, int startPeg, int endPeg) {
        if (disks == 0) {
            return;
        }

        int otherPeg = 6 - startPeg - endPeg;
        hanoi(disks - 1, startPeg, otherPeg);
        moveDisk(disks, startPeg, endPeg);
        hanoi(disks - 1, otherPeg, endPeg);
    }
}
