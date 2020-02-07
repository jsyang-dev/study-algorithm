package me.study.algorithm.codility.timecomplexity.permmissingelem;

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

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new int[] {2,3,1,5}, 4},
                new Object[] {new int[] {2,3,4,5}, 1},
                new Object[] {new int[] {2,3,4,1}, 5},
                new Object[] {new int[] {}, 1}
        };
    }
}