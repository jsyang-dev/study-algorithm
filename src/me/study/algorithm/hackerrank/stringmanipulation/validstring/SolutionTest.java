package me.study.algorithm.hackerrank.stringmanipulation.validstring;

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
                new Object[] {"aabbcd", "NO"},
                new Object[] {"aabbccddeefghi", "NO"},
                new Object[] {"abcdefghhgfedecba", "YES"},
                new Object[] {"aaaabbcc", "NO"},
                new Object[] {"aaaabbcc", "NO"}
        };
    }
}