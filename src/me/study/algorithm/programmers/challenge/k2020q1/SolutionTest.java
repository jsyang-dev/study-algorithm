package me.study.algorithm.programmers.challenge.k2020q1;

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
    public void test(String s, int answer) {
        int result = this.solution.solution(s);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {"aabbaccc", 7},
                new Object[] {"ababcdcdababcdcd", 9},
                new Object[] {"abcabcdede", 8},
                new Object[] {"abcabcabcabcdededededede", 14},
                new Object[] {"xababcdcdababcdcd", 17},
        };
    }
}
