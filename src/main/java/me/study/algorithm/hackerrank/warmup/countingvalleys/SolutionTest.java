package me.study.algorithm.hackerrank.warmup.countingvalleys;

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
    public void test(int n, String s, int answer) {
        int result = this.solution.solution(n, s);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {8, "UDDDUDUU", 1},
                new Object[] {12, "DDUUDDUDUUUD", 2}
        };
    }
}