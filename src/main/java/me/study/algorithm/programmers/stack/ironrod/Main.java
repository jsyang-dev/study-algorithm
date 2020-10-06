package me.study.algorithm.programmers.stack.ironrod;

/**
 * [쇠막대기]
 * arrangement의 길이는 최대 100,000입니다.
 * arrangement의 여는 괄호와 닫는 괄호는 항상 쌍을 이룹니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String arrangement;

        arrangement = "()(((()())(())()))(())";
        System.out.println(solution.solution(arrangement));
    }
}

