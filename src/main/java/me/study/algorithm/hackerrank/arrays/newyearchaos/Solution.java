package me.study.algorithm.hackerrank.arrays.newyearchaos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] q) {
        int result = 0;
        int[] arr = new int[q.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < q.length; i++) {
            arr[i] = i + 1;
        }

        int action = -1;
        while (action != 0) {
            action = 0;
            for (int i = 0; i < q.length; i++) {
                int start = Math.max(i - 2, 0);
                int end = Math.min(i + 2, q.length - 1);

                for (int j = start; j < i; j++) {
                    int left = map.getOrDefault(arr[j], 0);
                    int right = map.getOrDefault(arr[j + 1], 0);
                    if (arr[j] == q[i]) {
                        if (arr[j] > arr[j + 1] && left < 2) {
                            map.put(arr[j], left + 1);
                        } else if (arr[j] < arr[j + 1] && right < 2) {
                            map.put(arr[j + 1], right + 1);
                        } else {
                            continue;
                        }

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        result++;
                        action++;
                    }
                }

                for (int j = end; j > i; j--) {
                    int left = map.getOrDefault(arr[j - 1], 0);
                    int right = map.getOrDefault(arr[j], 0);
                    if (arr[j] == q[i]) {
                        if (arr[j - 1] > arr[j] && left < 2) {
                            map.put(arr[j - 1], left + 1);
                        } else if (arr[j - 1] < arr[j] && right < 2) {
                            map.put(arr[j], right + 1);
                        } else {
                            continue;
                        }

                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;

                        result++;
                        action++;
                    }
                }
            }
        }

        if (Arrays.equals(arr, q)) {
            System.out.println(result);
        } else {
            System.out.println("Too chaotic");
        }

        return Arrays.equals(arr, q) ? String.valueOf(result) : "Too chaotic";
    }
}