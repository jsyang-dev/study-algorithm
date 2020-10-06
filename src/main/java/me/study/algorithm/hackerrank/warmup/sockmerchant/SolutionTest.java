package me.study.algorithm.hackerrank.warmup.sockmerchant;

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
    public void test(int n, int[] ar, int answer) {
        int result = this.solution.solution(n, ar);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}, 3},
                new Object[] {10, new int[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}, 4}
        };
    }
}