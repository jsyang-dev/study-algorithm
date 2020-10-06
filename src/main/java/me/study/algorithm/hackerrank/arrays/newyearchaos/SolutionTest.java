package me.study.algorithm.hackerrank.arrays.newyearchaos;

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
    public void test(int[] q, String answer) {
        String result = this.solution.solution(q);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("2 1 5 3 4".split(" ")).mapToInt(Integer::parseInt).toArray(), "3"},
                new Object[] {Arrays.stream("2 5 1 3 4".split(" ")).mapToInt(Integer::parseInt).toArray(), "Too chaotic"},
        };
    }
}