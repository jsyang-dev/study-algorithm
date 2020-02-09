package me.study.algorithm.practice.recursive.flip;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] someList = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(flip(someList)));
    }

    private static int[] flip(int[] list) {
        if (list.length == 1) {
            return list;
        }

        int[] mergedList = new int[list.length];
        int[] flipList1 = flip(Arrays.copyOfRange(list, 0, 1));
        int[] flipList2 = flip(Arrays.copyOfRange(list, 1, list.length));
        System.arraycopy(flipList2, 0, mergedList, 0, flipList2.length);
        System.arraycopy(flipList1, 0, mergedList, flipList2.length, flipList1.length);
        return mergedList;
    }
}
