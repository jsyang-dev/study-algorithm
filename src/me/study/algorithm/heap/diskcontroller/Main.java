package me.study.algorithm.heap.diskcontroller;

/**
 * [디스크 컨트롤러]
 * jobs의 길이는 1 이상 500 이하입니다.
 * jobs의 각 행은 하나의 작업에 대한 [작업이 요청되는 시점, 작업의 소요시간] 입니다.
 * 각 작업에 대해 작업이 요청되는 시간은 0 이상 1,000 이하입니다.
 * 각 작업에 대해 작업의 소요시간은 1 이상 1,000 이하입니다.
 * 하드디스크가 작업을 수행하고 있지 않을 때에는 먼저 요청이 들어온 작업부터 처리합니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] jobs;

        jobs = new int[][] {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution.solution(jobs));
    }
}