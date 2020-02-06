package me.study.algorithm.programmers.queue.development;

import java.util.Arrays;

/**
 * [기능개발]
 * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
 * 작업 진도는 100 미만의 자연수입니다.
 * 작업 속도는 100 이하의 자연수입니다.
 * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses;
        int[] speeds;

        progresses = new int[] {93,30,55};
        speeds = new int[] {1,30,5};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
}

