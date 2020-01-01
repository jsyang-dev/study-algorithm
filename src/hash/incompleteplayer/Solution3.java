package hash.incompleteplayer;

import java.util.Arrays;

class Solution3 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            if (i >= completion.length || !participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}
