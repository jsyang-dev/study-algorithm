package me.study.algorithm.sort.hindex;

/**
 * [H-Index]
 * 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
 * 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] citations;

        citations = new int[] {3, 0, 6, 1, 5};
        System.out.println(solution.solution(citations));

        citations = new int[] {4, 3, 3, 3, 3};
        System.out.println(solution.solution(citations));
    }
}

