package me.study.algorithm.programmers.challenge.k2020q2;

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
    public void test(String s, String answer) {
        String result = this.solution.solution(s);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {"(()())()", "(()())()"},
                new Object[] {")(", "()"},
                new Object[] {"()))((()", "()(())()"},
        };
    }
}
