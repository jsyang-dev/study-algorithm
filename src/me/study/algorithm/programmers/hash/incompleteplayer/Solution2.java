package me.study.algorithm.programmers.hash.incompleteplayer;

import java.util.Arrays;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int participantIndex = 0;
        for (String player: completion) {
            if (!player.equals(participant[participantIndex])) {
                answer = participant[participantIndex];
                break;
            }
            participantIndex++;
        }

        if (participantIndex < participant.length) {
            answer = participant[participantIndex];
        }

        return answer;
    }
}