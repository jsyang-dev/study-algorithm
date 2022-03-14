package me.study.algorithm.codility2.time_complexity.frog_jmp;

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
    public void test(int X, int Y, int D, int answer) {
        int result = this.solution.solution(X, Y, D);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{10, 85, 30, 3},
        };
    }
}
