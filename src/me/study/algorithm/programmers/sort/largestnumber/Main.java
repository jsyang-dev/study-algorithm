package me.study.algorithm.programmers.sort.largestnumber;

/**
 * [가장 큰 수]
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers;

        numbers = new int[] {6, 10, 2};
        System.out.println(solution.solution(numbers));

        numbers = new int[] {3, 30, 34, 5, 9};
        System.out.println(solution.solution(numbers));

        numbers = new int[] {0,0,0,0,0};
        System.out.println(solution.solution(numbers));
    }
}

