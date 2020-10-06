package me.study.algorithm.hackerrank.warmup.repeatedstring;

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
    public void test(String s, long n, long answer) {
        long result = this.solution.solution(s, n);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {"aba", 10, 7},
                new Object[] {"a", 1000000000000L, 1000000000000L}
        };
    }
}