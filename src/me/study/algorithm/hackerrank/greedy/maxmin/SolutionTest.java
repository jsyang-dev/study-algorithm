package me.study.algorithm.hackerrank.greedy.maxmin;

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
    public void test(int k, int[] arr, int answer) {
        int result = this.solution.solution(k, arr);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {3, new int[] {10, 100, 300, 200, 1000, 20, 30}, 20},
                new Object[] {4, new int[] {1, 2, 3, 4, 10, 20, 30, 40, 100, 200}, 3},
                new Object[] {2, new int[] {1, 2, 1, 2, 1}, 0}
        };
    }
}