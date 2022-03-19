package me.study.algorithm.programmers.bruteforce.carpet;

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
    public void test(int brown, int yellow, int[] answer) {
        int[] result = this.solution.solution(brown, yellow);

        assertArrayEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{10, 2, new int[]{4, 3}},
                new Object[]{8, 1, new int[]{3, 3}},
                new Object[]{24, 24, new int[]{8, 6}},
        };
    }
}
