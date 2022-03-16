package me.study.algorithm.codility2.prefix_sums.count_div;

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
    public void test(int A, int B, int K, int answer) {
        int result = this.solution.solution(A, B, K);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{6, 11, 2, 3},
                new Object[]{0, 1, 11, 1},
                new Object[]{10, 10, 7, 0},
        };
    }
}
