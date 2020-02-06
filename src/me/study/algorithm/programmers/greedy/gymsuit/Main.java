package me.study.algorithm.programmers.greedy.gymsuit;

/**
 * [체육복]
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] lost;
        int[] reserve;

        n = 5;
        lost = new int[] {2, 4};
        reserve = new int[] {1, 3, 5};
        System.out.println(solution.solution(n, lost, reserve));

        n = 5;
        lost = new int[] {2, 4};
        reserve = new int[] {3};
        System.out.println(solution.solution(n, lost, reserve));

        n = 3;
        lost = new int[] {3};
        reserve = new int[] {1};
        System.out.println(solution.solution(n, lost, reserve));

        n = 10;
        lost = new int[] {3,9,10};
        reserve = new int[] {3,8,9};
        System.out.println(solution.solution(n, lost, reserve));

        n = 3;
        lost = new int[] {1, 2};
        reserve = new int[] {2, 3};
        System.out.println(solution.solution(n, lost, reserve));
    }
}