package me.study.algorithm.hackerrank.stringmanipulation.alternatingcharacters;

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
                new Object[] {"AAAA", 3},
                new Object[] {"BBBBB", 4},
                new Object[] {"ABABABAB", 0},
                new Object[] {"BABABA", 0},
                new Object[] {"AAABBB", 4},
        };
    }
}