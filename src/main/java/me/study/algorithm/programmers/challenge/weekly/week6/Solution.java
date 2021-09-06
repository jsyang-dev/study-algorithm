package me.study.algorithm.programmers.challenge.weekly.week6;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int boxerCount = head2head.length;
        int[] winCount = new int[boxerCount];
        int[] winHeavierCount = new int[boxerCount];
        int[] matchCount = new int[boxerCount];

        calculateWinCount(weights, head2head, boxerCount, winCount, winHeavierCount, matchCount);

        List<float[]> listForSort = makeListForSort(weights, boxerCount, winCount, winHeavierCount, matchCount);

        sort(listForSort);

        return makeAnswer(listForSort);
    }

    private List<float[]> makeListForSort(int[] weights, int boxerCount, int[] winCount, int[] winHeavierCount, int[] matchCount) {
        List<float[]> listForSort = new ArrayList<>();
        for (int i = 0; i < boxerCount; i++) {
            listForSort.add(new float[]{
                    matchCount[i] == 0 ? 0 : (float) winCount[i] / matchCount[i],        // 전체 승률
                    matchCount[i] == 0 ? 0 : (float) winHeavierCount[i] / matchCount[i], // 자신보다 무거운 복서를 이긴 승률
                    weights[i],     // 몸무게
                    i + 1           // 번호
            });
        }
        return listForSort;
    }

    private void calculateWinCount(int[] weights, String[] head2head, int boxerCount, int[] winCount, int[] winHeavierCount, int[] matchCount) {
        for (int i = 0; i < boxerCount; i++) {
            for (int j = i + 1; j < head2head.length; j++) {
                char result = head2head[i].charAt(j);

                if (result == 'N') {
                    continue;
                }

                if (result == 'W') {
                    addWinCount(i, j, weights, winCount, winHeavierCount);
                }

                if (result == 'L') {
                    addWinCount(j, i, weights, winCount, winHeavierCount);
                }

                matchCount[i]++;
                matchCount[j]++;
            }
        }
    }

    private void addWinCount(int winner, int loser, int[] weights, int[] winCount, int[] winHeavierCount) {
        winCount[winner]++;
        if (weights[loser] > weights[winner]) {
            winHeavierCount[winner]++;
        }
    }

    private void sort(List<float[]> listForSort) {
        listForSort.sort((o1, o2) -> {
            int sortResultByWinCount = sortDescending(o1[0], o2[0]);
            if (sortResultByWinCount != 0) return sortResultByWinCount;

            int sortResultByWinHeavierCount = sortDescending(o1[1], o2[1]);
            if (sortResultByWinHeavierCount != 0) return sortResultByWinHeavierCount;

            int sortResultByWeight = sortDescending(o1[2], o2[2]);
            if (sortResultByWeight != 0) return sortResultByWeight;

            return sortAscending(o1[2], o2[2]);
        });
    }

    private int sortAscending(float i1, float i2) {
        int result = 0;
        if (i1 < i2) {
            result = -1;
        } else if (i1 > i2) {
            result = 1;
        }
        return result;
    }

    private int sortDescending(float i1, float i2) {
        int result = 0;
        if (i1 > i2) {
            result = -1;
        } else if (i1 < i2) {
            result = 1;
        }
        return result;
    }

    private int[] makeAnswer(List<float[]> listForSort) {
        return listForSort.stream().mapToInt(key -> (int) key[3]).toArray();
    }
}
