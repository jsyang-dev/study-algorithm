package me.study.algorithm.hash.bestalbum;

import java.util.Arrays;

/**
 * [위장]
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 *
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] genres;
        int[] plays;

        genres = new String[] {"classic", "pop", "classic", "classic", "pop"};
        plays = new int[] {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(solution.solution(genres, plays)));
    }
}

