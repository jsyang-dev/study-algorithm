package me.study.algorithm.hackerrank.search.triplesum;

import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public long solution(int[] a, int[] b, int[] c) {
        int result = 0;
        SortedSet<Integer> aSet = new TreeSet<>();
        SortedSet<Integer> bSet = new TreeSet<>();
        SortedSet<Integer> cSet = new TreeSet<>();
        int aIndex = 0;
        int cIndex = 0;

        for (int value : a) {
            aSet.add(value);
        }
        for (int value : b) {
            bSet.add(value);
        }
        for (int value : c) {
            cSet.add(value);
        }

        int[] aArr = aSet.stream().mapToInt(Integer::intValue).toArray();
        int[] cArr = cSet.stream().mapToInt(Integer::intValue).toArray();

        for (int findValue : bSet) {
            while (aIndex < aArr.length  && aArr[aIndex] <= findValue) {
                aIndex++;
            }
            while (cIndex < cArr.length && cArr[cIndex] <= findValue) {
                cIndex++;
            }

            result += aIndex * cIndex;
        }

        return result;
    }
}