package me.study.algorithm.queue.printer;

/**
 * [프린터]
 * 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
 * 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
 * location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities;
        int location;

        priorities = new int[] {2, 1, 3, 2};
        location = 2;
        System.out.println(solution.solution(priorities, location));

        priorities = new int[] {1, 1, 9, 1, 1, 1};
        location = 0;
        System.out.println(solution.solution(priorities, location));

    }
}

