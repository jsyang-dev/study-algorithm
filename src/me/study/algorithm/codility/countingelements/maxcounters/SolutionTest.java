package me.study.algorithm.codility.countingelements.maxcounters;

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
    public void test(int N, int[] A, int[] answer) {
        int[] result = this.solution.solution(N, A);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {5, new int[] {3,4,4,6,1,4,4}, new int[] {3,2,2,4,2}}
        };
    }
}