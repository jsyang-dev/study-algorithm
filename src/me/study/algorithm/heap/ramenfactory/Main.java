package me.study.algorithm.heap.ramenfactory;

/**
 * [라면공장]
 * stock에 있는 밀가루는 오늘(0일 이후)부터 사용됩니다.
 * stock과 k는 2 이상 100,000 이하입니다.
 * dates의 각 원소는 1 이상 k 이하입니다.
 * supplies의 각 원소는 1 이상 1,000 이하입니다.
 * dates와 supplies의 길이는 1 이상 20,000 이하입니다.
 * k일 째에는 밀가루가 충분히 공급되기 때문에 k-1일에 사용할 수량까지만 확보하면 됩니다.
 * dates에 들어있는 날짜는 오름차순 정렬되어 있습니다.
 * dates에 들어있는 날짜에 공급되는 밀가루는 작업 시작 전 새벽에 공급되는 것을 기준으로 합니다. 예를 들어 9일째에 밀가루가 바닥나더라도, 10일째에 공급받으면 10일째에는 공장을 운영할 수 있습니다.
 * 밀가루가 바닥나는 경우는 주어지지 않습니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int stock;
        int[] dates;
        int[] supplies;
        int k;

        stock = 4;
        dates = new int[] {4,10,15};
        supplies = new int[] {20,5,10};
        k = 30;
        System.out.println(solution.solution(stock, dates, supplies, k));

        stock = 4;
        dates = new int[] {1, 2, 3, 4};
        supplies = new int[] {10, 40, 30, 20};
        k = 100;
        System.out.println(solution.solution(stock, dates, supplies, k));
    }
}