package me.study.algorithm.hackerrank.search.triplesum;

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
    public void test(int[] a, int[] b, int[] c, long answer) {
        long result = this.solution.solution(a, b, c);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new int[] {1, 3, 5}, new int[] {2, 3}, new int[] {1, 2, 3}, 8},
                new Object[] {new int[] {1, 4, 5}, new int[] {2, 3, 3}, new int[] {1, 2, 3}, 5},
                new Object[] {new int[] {1, 3, 5, 7}, new int[] {5, 7, 9}, new int[] {7, 9, 11, 13}, 12}
        };
    }
}