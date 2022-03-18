package me.study.algorithm.codility2.leader.equi_leader;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        Map<Integer, Integer> leftCounters = new HashMap<>();
        SortedMap<Integer, Integer> leftCountersOfCounters = new TreeMap<>(Comparator.reverseOrder());
        Map<Integer, Integer> rightCounters = new HashMap<>();
        SortedMap<Integer, Integer> rightCountersOfCounters = new TreeMap<>(Comparator.reverseOrder());

        for (int number : A) {
            int prevCount = rightCounters.getOrDefault(number, 0);
            int newCount = prevCount + 1;
            rightCounters.put(number, newCount);

            rightCountersOfCounters.put(newCount, rightCountersOfCounters.getOrDefault(newCount, 0) + 1);
            if (prevCount > 0) {
                int rightPrevCountValue = rightCountersOfCounters.getOrDefault(prevCount, 0);
                if (rightPrevCountValue - 1 == 0) {
                    rightCountersOfCounters.remove(prevCount);
                } else {
                    rightCountersOfCounters.put(prevCount, rightPrevCountValue - 1);
                }
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            int leftPrevCount = leftCounters.getOrDefault(A[i], 0);
            int leftNewCount = leftPrevCount + 1;
            leftCounters.put(A[i], leftNewCount);

            leftCountersOfCounters.put(leftNewCount, leftCountersOfCounters.getOrDefault(leftNewCount, 0) + 1);
            if (leftPrevCount > 0) {
                leftCountersOfCounters.put(leftPrevCount, leftCountersOfCounters.getOrDefault(leftPrevCount, 0) - 1);
            }

            int rightPrevCount = rightCounters.get(A[i]);
            int rightNewCount = rightPrevCount - 1;
            rightCounters.put(A[i], rightNewCount);

            if (rightNewCount > 0) {
                rightCountersOfCounters.put(rightNewCount, rightCountersOfCounters.getOrDefault(rightNewCount, 0) + 1);
            }
            int rightPrevCountValue = rightCountersOfCounters.getOrDefault(rightPrevCount, 0);
            if (rightPrevCountValue - 1 == 0) {
                rightCountersOfCounters.remove(rightPrevCount);
            } else {
                rightCountersOfCounters.put(rightPrevCount, rightPrevCountValue - 1);
            }
            Set<Map.Entry<Integer, Integer>> entries = leftCountersOfCounters.entrySet();
            Object[] leftKeys = leftCountersOfCounters.entrySet().toArray();
            Object[] rightKeys = rightCountersOfCounters.entrySet().toArray();
            boolean leftLeader = false;
            boolean rightLeader = false;
            int leftLeaderNumber = 0;

            if (leftKeys.length == 1 || (leftKeys.length >= 2 && ((Map.Entry<Integer, Integer>) leftKeys[0]).getKey() > ((Map.Entry<Integer, Integer>) leftKeys[1]).getKey())) {
                Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) leftKeys[0];
                if (entry.getKey() > (i + 1) / 2) {
                    leftLeader = true;
                    leftLeaderNumber = entry.getValue();
                }
            }
            if (rightKeys.length == 1 || (rightKeys.length >= 2 && ((Map.Entry<Integer, Integer>) rightKeys[0]).getKey() > ((Map.Entry<Integer, Integer>) rightKeys[1]).getKey())) {
                Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) rightKeys[0];
                if (entry.getKey() > (A.length - i - 1) / 2 && entry.getValue() == leftLeaderNumber) {
                    rightLeader = true;
                }
            }
            if (leftLeader && rightLeader) {
                result++;
            }
        }

        return result;
    }
}
