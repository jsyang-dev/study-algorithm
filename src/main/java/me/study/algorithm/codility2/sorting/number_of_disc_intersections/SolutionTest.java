package me.study.algorithm.codility2.sorting.number_of_disc_intersections;

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
                new Object[]{new int[]{1, 5, 2, 1, 4, 0}, 11},
                new Object[]{new int[]{1, 2147483647, 0}, 2},
        };
    }
}
