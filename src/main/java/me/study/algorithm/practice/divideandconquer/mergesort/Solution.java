package me.study.algorithm.practice.divideandconquer.mergesort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1, 3, 5, 7, 9, 11, 13, 11})));
        System.out.println(Arrays.toString(mergeSort(new int[]{28, 13, 9, 30, 1, 48, 5, 7, 15})));
        System.out.println(Arrays.toString(mergeSort(new int[]{2, 5, 6, 7, 1, 2, 4, 7, 10, 11, 4, 15, 13, 1, 6, 4})));
    }

    private static int[] mergeSort(int[] list) {
        if (list.length <= 1) {
            return list;
        }

        int mid = list.length / 2;
        int[] list1 = new int[mid];
        int[] list2 = new int[list.length - mid];

        System.arraycopy(list, 0, list1, 0, mid);
        System.arraycopy(list, mid, list2, 0, list.length - mid);

        return merge(mergeSort(list1), mergeSort(list2));
    }


    private static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int list1Index = 0;
        int list2Index = 0;
        int mergedListIndex = 0;

        while (list1Index < list1.length && list2Index < list2.length) {
            if (list1[list1Index] < list2[list2Index]) {
                mergedList[mergedListIndex] = list1[list1Index];
                list1Index++;
                mergedListIndex++;
            } else {
                mergedList[mergedListIndex] = list2[list2Index];
                list2Index++;
                mergedListIndex++;
            }
        }

        if (list1Index < list1.length) {
            for (int i = list1Index; i < list1.length; i++) {

                mergedList[mergedListIndex] = list1[i];
                mergedListIndex++;
            }
        }
        if (list2Index < list2.length) {
            for (int i = list2Index; i < list2.length; i++) {
                mergedList[mergedListIndex] = list2[i];
                mergedListIndex++;
            }
        }

        return mergedList;
    }
}
