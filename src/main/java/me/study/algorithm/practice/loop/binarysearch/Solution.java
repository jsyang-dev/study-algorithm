package me.study.algorithm.practice.loop.binarysearch;

public class Solution {
    public static void main(String[] args) {
        System.out.println(binarySearch(2, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(0, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(5, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(3, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(11, new int[] {2, 3, 5, 7, 11}));
    }

    private static int binarySearch(int value, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
