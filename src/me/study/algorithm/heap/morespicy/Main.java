package me.study.algorithm.heap.morespicy;

/**
 * [더맵게]
 * scoville의 길이는 1 이상 1,000,000 이하입니다.
 * K는 0 이상 1,000,000,000 이하입니다.
 * scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
 * 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scoville;
        int K;

        scoville = new int[] {1, 2, 3, 9, 10, 12};
        K = 7;
        System.out.println(solution.solution(scoville, K));
    }
}

