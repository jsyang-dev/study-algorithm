package me.study.algorithm.hackerrank.hashmaps.anagrams;

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
                new Object[] {"abba", 4},
                new Object[] {"abcd", 0},
                new Object[] {"ifailuhkqq", 3},
                new Object[] {"kkkk", 10},
                new Object[] {"cdcd", 5}
        };
    }
}