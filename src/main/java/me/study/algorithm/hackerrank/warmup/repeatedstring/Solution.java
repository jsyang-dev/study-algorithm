package me.study.algorithm.hackerrank.warmup.repeatedstring;

class Solution {
    public long solution(String s, long n) {
        char findChar = 'a';
        long result = 0;
        long len = 0;
        long cnt = 0;
        int sLen = 0;

        // s에 포함된 'a' 개수 구하기
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == findChar) {
                sLen++;
            }
        }

        cnt = n / s.length();
        len = s.length() * cnt;
        result += (sLen * cnt);
        if (len < n) {
            String lastStr = s.substring(0, (int) (n - len));
            int lastStrLen = 0;
            for (int i = 0; i < lastStr.length(); i++) {
                if (lastStr.charAt(i) == findChar) {
                    lastStrLen++;
                }
            }
            result += lastStrLen;
        }

        return result;
    }
}