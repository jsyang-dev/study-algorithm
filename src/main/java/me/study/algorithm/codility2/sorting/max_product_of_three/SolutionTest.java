package me.study.algorithm.codility2.sorting.max_product_of_three;

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
                new Object[]{new int[]{-3, 1, 2, -2, 5, 6}, 60},
                new Object[]{new int[]{-4, -6, 3, 4, 5}, 120},
                new Object[]{new int[]{-5, -6, -4, -7, -10}, -120},
                new Object[]{new int[]{4, 7, 3, 2, 1, -3, -5}, 105},
        };
    }
}
