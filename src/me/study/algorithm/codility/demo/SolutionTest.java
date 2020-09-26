package me.study.algorithm.codility.demo;

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
    public void test(int[] A, int answer) {
        int result = this.solution.solution(A);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new int[] {1, 3, 6, 4, 1, 2}, 5},
                new Object[] {new int[] {1, 2, 3}, 4},
                new Object[] {new int[] {-1, -3}, 1},
                new Object[] {new int[] {-1, 0, 2}, 1},
        };
    }
}