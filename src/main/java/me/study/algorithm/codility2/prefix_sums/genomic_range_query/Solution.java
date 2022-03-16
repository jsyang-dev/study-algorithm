package me.study.algorithm.codility2.prefix_sums.genomic_range_query;

class Solution {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[][] counters = new int[S.length()][4];

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'A':
                    counters[i][0] = 1;
                    break;
                case 'C':
                    counters[i][1] = 1;
                    break;
                case 'G':
                    counters[i][2] = 1;
                    break;
                default:
                    counters[i][3] = 1;
                    break;
            }
        }

        for (int i = 1; i < S.length(); i++) {
            for (int j = 0; j < 4; j++)
                counters[i][j] += counters[i - 1][j];
        }

        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                int lowIndex = 0;

                // 로우 값보다 1 작은 값과 비교해야 함
                if (P[i] - 1 >= 0)
                    lowIndex = counters[P[i] - 1][j];

                if (counters[Q[i]][j] - lowIndex > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }

        return result;
    }
}
