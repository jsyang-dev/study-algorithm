package me.study.algorithm.hackerrank.arrays.arrayds;

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
    public void test(int[][] arr, int answer) {
        int result = this.solution.solution(arr);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {
                        new int[][] {
                                {1, 1, 1, 0, 0, 0},
                                {0, 1, 0, 0, 0, 0},
                                {1, 1, 1, 0, 0, 0},
                                {0, 0, 2, 4, 4, 0},
                                {0, 0, 0, 2, 0, 0},
                                {0, 0, 1, 2, 4, 0},
                        },
                        19
                }
        };
    }
}