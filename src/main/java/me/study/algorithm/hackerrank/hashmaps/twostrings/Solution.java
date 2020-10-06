package me.study.algorithm.hackerrank.hashmaps.twostrings;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s1, String s2) {
        String result = "NO";
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                result = "YES";
                break;
            }
        }

        return result;
    }
}