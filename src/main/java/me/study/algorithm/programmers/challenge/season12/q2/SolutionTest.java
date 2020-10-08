package me.study.algorithm.programmers.challenge.season12.q2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/*
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int[][] arr, int[] answer) {
        int[] result = this.solution.solution(arr);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[][] {new int[]{1,1,0,0}, new int[]{1,0,0,0}, new int[]{1,0,0,1}, new int[]{1,1,1,1}}, new int[]{4, 9}},
        };
    }
}
