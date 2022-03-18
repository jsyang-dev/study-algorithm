package me.study.algorithm.codility2.leader.dominator;

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
                new Object[]{new int[]{3, 4, 3, 2, 3, -1, 3, 3}, 7},
                new Object[]{new int[]{2, 1, 1, 3}, -1},
                new Object[]{new int[]{2147483647}, 0},
        };
    }
}
