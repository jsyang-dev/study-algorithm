package me.study.algorithm.codility2.arrays.cyclic_rotation;

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
    public void test(int[] A, int K, int[] answer) {
        int[] result = this.solution.solution(A, K);

        assertArrayEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}},
                new Object[]{new int[]{0, 0, 0}, 1, new int[]{0, 0, 0}},
                new Object[]{new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4}},
                new Object[]{new int[]{}, 1, new int[]{}},
        };
    }
}
