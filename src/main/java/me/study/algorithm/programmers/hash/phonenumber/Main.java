package me.study.algorithm.programmers.hash.phonenumber;

/**
 * [전화번호 목록]
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] phone_book;

        phone_book = new String[] {"119", "97674223", "1195524421"};
        System.out.println(solution.solution(phone_book));

        phone_book = new String[] {"123","456","789"};
        System.out.println(solution.solution(phone_book));

        phone_book = new String[] {"12","123","1235","567","88"};
        System.out.println(solution.solution(phone_book));
    }
}

