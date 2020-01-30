package me.study.algorithm.greedy.joystick;

/**
 * [조이스틱]
 * name은 알파벳 대문자로만 이루어져 있습니다.
 * name의 길이는 1 이상 20 이하입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String name;

//        name = "JAZ";
//        System.out.println(solution.solution(name));
//
//        name = "JEROEN";
//        System.out.println(solution.solution(name));
//
//        name = "JAN";
//        System.out.println(solution.solution(name));

        name = "ABABAAAAAAABA";
        System.out.println(solution.solution(name));
    }
}