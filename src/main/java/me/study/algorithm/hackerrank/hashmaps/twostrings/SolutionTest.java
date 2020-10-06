package me.study.algorithm.hackerrank.hashmaps.twostrings;

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
    public void test(String s1, String s2, String answer) {
        String result = this.solution.solution(s1, s2);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {"hello", "world", "YES"},
                new Object[] {"hi", "world", "NO"}
        };
    }
}