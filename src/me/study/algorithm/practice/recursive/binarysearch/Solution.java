package me.study.algorithm.practice.recursive.binarysearch;

public class Solution {
    public static void main(String[] args) {
        System.out.println(binarySearch(2, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(0, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(5, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(3, new int[] {2, 3, 5, 7, 11}));
        System.out.println(binarySearch(11, new int[] {2, 3, 5, 7, 11}));
    }

    private static int binarySearch(int value, int[] arr) {
        return binarySearch(value, arr, 0, arr.length - 1);
    }

    private static int binarySearch(int value, int[] arr, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        }

        int mid = (startIndex + endIndex) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return binarySearch(value, arr, startIndex, mid - 1);
        } else if (arr[mid] < value) {
            return binarySearch(value, arr, mid + 1, endIndex);
        }

        return -1;
    }
}
