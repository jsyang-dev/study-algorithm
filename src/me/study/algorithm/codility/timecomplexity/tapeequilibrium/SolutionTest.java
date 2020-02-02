package me.study.algorithm.codility.timecomplexity.tapeequilibrium;

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

        assertEquals(result, answer);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new int[] {3,1,2,4,3}, 1},
                new Object[] {new int[] {-1000,1000}, 2000}
        };
    }
}