package me.study.algorithm.hackerrank.dynamic.maxarraysum;

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
                new Object[] {Arrays.stream("3 5 -7 8 10".split(" ")).mapToInt(Integer::parseInt).toArray(), 15}
        };
    }
}