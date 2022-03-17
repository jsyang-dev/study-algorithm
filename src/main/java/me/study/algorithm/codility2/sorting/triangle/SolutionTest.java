package me.study.algorithm.codility2.sorting.triangle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

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
        return new Object[]{
                new Object[]{new int[]{10, 2, 5, 1, 8, 20}, 1},
                new Object[]{new int[]{10, 50, 5}, 0},
        };
    }
}
