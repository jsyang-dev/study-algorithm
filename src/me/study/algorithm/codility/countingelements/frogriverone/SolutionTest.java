package me.study.algorithm.codility.countingelements.frogriverone;

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
    public void test(int X, int[] A, int answer) {
        int result = this.solution.solution(X, A);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {5, new int[] {1,3,1,4,2,3,5,4}, 6}
        };
    }
}