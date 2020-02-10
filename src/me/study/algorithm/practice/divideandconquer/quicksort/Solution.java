package me.study.algorithm.practice.divideandconquer.quicksort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] list1 = new int[] {1, 3, 5, 7, 9, 11, 13, 11};
        quickSort(list1);
        System.out.println(Arrays.toString(list1));

        int[] list2 = new int[] {28, 13, 9, 30, 1, 48, 5, 7, 15};
        quickSort(list2);
        System.out.println(Arrays.toString(list2));

        int[] list3 = new int[] {2, 5, 6, 7, 1, 2, 4, 7, 10, 11, 4, 15, 13, 1, 6, 4};
        quickSort(list3);
        System.out.println(Arrays.toString(list3));
    }

    private static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = partition(list, start, end);
        quickSort(list, start, mid - 1);
        quickSort(list, mid + 1, end);
    }

    private static int partition(int[] list, int start, int end) {
        int i = start;
        int b = start;
        int p = end;

        while (i < end) {
            if (list[i] > list[p]) {
                i++;
            } else {
                swapElement(list, i, b);
                i++;
                b++;
            }
        }

        swapElement(list, b, p);

        return b;
    }

    private static void swapElement(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}
