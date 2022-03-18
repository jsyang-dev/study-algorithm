package me.study.algorithm.codility2.maximum_slice_problem.max_profit;

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
//                new Object[]{new int[]{23171, 21011, 21123, 21366, 21013, 21367}, 356},
                new Object[]{new int[]{8, 9, 3, 6, 1, 2}, 3},
        };
    }
}
