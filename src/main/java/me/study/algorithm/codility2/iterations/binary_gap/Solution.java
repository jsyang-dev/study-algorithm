package me.study.algorithm.codility2.iterations.binary_gap;

public class Solution {

    public int solution(int N) {
        int result = 0;
        String binaryString = Integer.toBinaryString(N);
        int firstIndex = binaryString.indexOf('1');

        int gap = 0;
        for (int i = firstIndex + 1; i < binaryString.length(); i++) {
             if (binaryString.charAt(i) == '0') {
                 gap++;
             } else {
                 if (gap > result) {
                     result = gap;
                 }
                 gap = 0;
             }
        }

        return result;
    }
}
