package me.study.algorithm.heap.diskcontroller;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<JobInfo> priorityQueue = new PriorityQueue<>();

        int max = 0;
        int lastIndex = 0;
        int remain = 0;
        for (int i = 0; i <= max; i++) {
            if (lastIndex < jobs.length) {
                while (jobs[lastIndex][0] == i) {
                    priorityQueue.offer(new JobInfo(jobs[lastIndex][0], jobs[lastIndex][1]));
                    lastIndex++;
                    if (lastIndex >= jobs.length) {
                        break;
                    }
                }
            }

            if (remain == 0) {
                if (priorityQueue.size() > 0 || lastIndex < jobs.length) {
                    JobInfo jobInfo = priorityQueue.poll();
                    max += jobInfo.getTime();
                    remain = jobInfo.getTime() - 1;
                    answer += i - jobInfo.getStart() + jobInfo.getTime();
                } else {
                    answer = answer / jobs.length;
                    break;
                }
            } else {
                remain--;
            }
        }

        return answer;
    }
}

class JobInfo implements Comparable<JobInfo> {

    private int start;
    private int time;

    public int getStart() {
        return start;
    }

    public int getTime() {
        return time;
    }

    public JobInfo(int start, int time) {
        this.start = start;
        this.time = time;
    }

    @Override
    public int compareTo(JobInfo o) {
        if (this.time < o.time) return -1;
        if (this.time > o.time) return 1;
        return 0;
    }
}