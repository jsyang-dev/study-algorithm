package me.study.algorithm.programmers.challenge.season12.q1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/*
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int n, int answer) {
        int result = this.solution.solution(n);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{45, 7},
                new Object[]{125, 229}
        };
    }
}
