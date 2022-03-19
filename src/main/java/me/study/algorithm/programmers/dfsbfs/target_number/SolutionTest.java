package me.study.algorithm.programmers.dfsbfs.target_number;

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
    public void test(int[] numbers, int target, int answer) {
        int result = this.solution.solution(numbers, target);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{1, 1, 1, 1, 1}, 3, 5},
        };
    }
}
