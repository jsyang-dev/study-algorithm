package me.study.algorithm.hackerrank.warmup.jumpingontheclouds;

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
    public void test(int[] c, int answer) {
        int result = this.solution.solution(c);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new int[] {0, 0, 1, 0, 0, 1, 0}, 4},
                new Object[] {new int[] {0, 0, 0, 1, 0, 0}, 3}
        };
    }
}