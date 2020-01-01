package me.study.algorithm.hash.incompleteplayer;

/**
 * [완주하지 못한 선수]
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant;
        String[] completion;

        participant = new String[] {"leo", "kiki", "eden"};
        completion = new String[] {"eden", "kiki"};
        System.out.println(solution.solution(participant, completion));

        participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[] {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution.solution(participant, completion));

        participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        completion = new String[] {"stanko", "ana", "mislav"};
        System.out.println(solution.solution(participant, completion));
    }
}

