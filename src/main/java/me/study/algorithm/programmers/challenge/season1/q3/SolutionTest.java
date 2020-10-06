package me.study.algorithm.programmers.challenge.season1.q3;

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
    public void test(int[] a, int answer) {
        int result = this.solution.solution(a);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{9,-1,-5}, 3},
                new Object[]{new int[]{-16,27,65,-2,58,-92,-71,-68,-61,-33}, 6}
        };
    }
}
