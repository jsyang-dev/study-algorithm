package me.study.algorithm.codility2.counting_elements.max_counters;

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
    public void test(int N, int[] A, int[] answer) {
        int[] result = this.solution.solution(N, A);

        assertArrayEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{5, new int[]{3, 4, 4, 6, 1, 4, 4}, new int[]{3, 2, 2, 4, 2}},
                new Object[]{1, new int[]{1}, new int[]{1}},
                new Object[]{1, new int[]{2, 1, 1, 2, 1}, new int[]{3}},
        };
    }
}
