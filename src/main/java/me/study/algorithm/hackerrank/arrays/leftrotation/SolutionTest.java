package me.study.algorithm.hackerrank.arrays.leftrotation;

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
    public void test(int[] a, int d, int[] answer) {
        int[] result = this.solution.solution(a, d);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {
                        Arrays.stream("1 2 3 4 5".split(" ")).mapToInt(Integer::parseInt).toArray(),
                        4,
                        Arrays.stream("5 1 2 3 4".split(" ")).mapToInt(Integer::parseInt).toArray()
                }
        };
    }
}