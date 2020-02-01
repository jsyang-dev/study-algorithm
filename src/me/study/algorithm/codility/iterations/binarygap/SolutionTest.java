package me.study.algorithm.codility.iterations.binarygap;

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
    public void test(int N, int answer) {
        int result = this.solution.solution(N);

        assertEquals(result, answer);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {9, 2},
                new Object[] {529, 4},
                new Object[] {20, 1},
                new Object[] {15, 0},
                new Object[] {32, 0},
                new Object[] {561892, 3}
        };
    }
}