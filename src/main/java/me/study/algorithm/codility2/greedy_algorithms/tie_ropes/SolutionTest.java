package me.study.algorithm.codility2.greedy_algorithms.tie_ropes;

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
    public void test(int K, int[] A, int answer) {
        int result = this.solution.solution(K, A);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{4, new int[]{1, 2, 3, 4, 1, 1, 3}, 3},
        };
    }
}
