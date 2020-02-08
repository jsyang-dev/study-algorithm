package me.study.algorithm.hackerrank.greedy.luckbalance;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int k, int[][] contests, int answer) {
        int result = this.solution.solution(k, contests);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {
                        3,
                        new int[][] {
                                {5, 1},
                                {2, 1},
                                {1, 1},
                                {8, 1},
                                {10, 0},
                                {5, 0}
                        },
                        29}
        };
    }
}