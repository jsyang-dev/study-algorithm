package me.study.algorithm.programmers.challenge.k2020q1;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int maxCount = (int) Math.ceil(s.length() / (double) i);
            int len = 0;
            int wordCount = 0;
            String prevWord = "";

            for (int j = 0; j < maxCount; j++) {
                String word;
                if (i * j + i > s.length()) {
                    word = s.substring(i * j);
                } else {
                    word = s.substring(i * j, i * j + i);
                }

                if (word.equals(prevWord)) {
                    wordCount++;
                } else {
                    if (!prevWord.equals("")) {
                        len += prevWord.length() + (wordCount == 1 ? 0 : String.valueOf(wordCount).length());
                    }

                    prevWord = word;
                    wordCount = 1;
                }
            }

            len += prevWord.length() + (wordCount == 1 ? 0 : String.valueOf(wordCount).length());
            answer = Math.min(answer, len);
        }

        return answer;
    }
}