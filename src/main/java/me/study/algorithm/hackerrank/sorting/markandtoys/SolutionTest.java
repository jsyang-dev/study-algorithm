package me.study.algorithm.hackerrank.sorting.markandtoys;

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
    public void test(int[] prices, int k, int answer) {
        int result = this.solution.solution(prices, k);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("1 12 5 111 200 1000 10".split(" ")).mapToInt(Integer::parseInt).toArray(), 50, 4}
        };
    }
}