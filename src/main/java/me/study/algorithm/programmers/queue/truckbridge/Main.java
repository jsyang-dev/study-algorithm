package me.study.algorithm.programmers.queue.truckbridge;

/**
 * [다리를 지나는 트럭]
 * bridge_length는 1 이상 10,000 이하입니다.
 * weight는 1 이상 10,000 이하입니다.
 * truck_weights의 길이는 1 이상 10,000 이하입니다.
 * 모든 트럭의 무게는 1 이상 weight 이하입니다.
 */
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int bridge_length;
        int weight;
        int[] truck_weights;

        bridge_length = 2;
        weight = 10;
        truck_weights = new int[] {7,4,5,6};
        System.out.println(solution.solution(bridge_length, weight, truck_weights));

        bridge_length = 100;
        weight = 100;
        truck_weights = new int[] {10};
        System.out.println(solution.solution(bridge_length, weight, truck_weights));

        bridge_length = 100;
        weight = 100;
        truck_weights = new int[] {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution.solution(bridge_length, weight, truck_weights));
    }
}

