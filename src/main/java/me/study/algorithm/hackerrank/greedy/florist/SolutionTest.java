package me.study.algorithm.hackerrank.greedy.florist;

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
    public void test(int k, int[] c, int answer) {
        int result = this.solution.solution(k, c);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {3, Arrays.stream("2 5 6".split(" ")).mapToInt(Integer::parseInt).toArray(), 13},
                new Object[] {2, Arrays.stream("2 5 6".split(" ")).mapToInt(Integer::parseInt).toArray(), 15},
                new Object[] {3, Arrays.stream("1 3 5 7 9".split(" ")).mapToInt(Integer::parseInt).toArray(), 29}
        };
    }
}