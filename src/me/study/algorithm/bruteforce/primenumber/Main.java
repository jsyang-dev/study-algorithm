package me.study.algorithm.bruteforce.primenumber;

/**
 * [소수 찾기]
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 *  * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 *  * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String numbers;

        numbers = "17";
        System.out.println(solution.solution(numbers));

        numbers = "011";
        System.out.println(solution.solution(numbers));
    }
}