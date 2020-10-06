package me.study.algorithm.hackerrank.stacksandqueues.largestrectangle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int[] h, long answer) {
        long result = this.solution.solution(h);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("1 2 3 4 5".split(" ")).mapToInt(Integer::parseInt).toArray(), 9},
                new Object[] {Arrays.stream("2 4 2 1".split(" ")).mapToInt(Integer::parseInt).toArray(), 6}
        };
    }
}