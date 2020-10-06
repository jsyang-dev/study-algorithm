package me.study.algorithm.hackerrank.greedy.absolutedifference;

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
    public void test(int[] arr, int answer) {
        int result = this.solution.solution(arr);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("3 -7 0".split(" ")).mapToInt(Integer::parseInt).toArray(), 3},
                new Object[] {Arrays.stream("-59 -36 -13 1 -53 -92 -2 -96 -54 75".split(" ")).mapToInt(Integer::parseInt).toArray(), 1},
                new Object[] {Arrays.stream("1 -3 71 68 17".split(" ")).mapToInt(Integer::parseInt).toArray(), 3}
        };
    }
}