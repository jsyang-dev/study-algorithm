package me.study.algorithm.codility.iterations.binarygap;

class Solution {
    public int solution (int N) {
        int answer = 0;
        int gap = 0;
        String binaryString = Integer.toBinaryString(N);
        System.out.println("binaryString = " + binaryString);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (gap > answer) {
                    answer = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
        }

        return answer;
    }
}