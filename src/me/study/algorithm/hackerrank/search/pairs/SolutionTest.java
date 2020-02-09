package me.study.algorithm.hackerrank.search.pairs;

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
    public void test(int k, int[] arr, int answer) {
        int result = this.solution.solution(k, arr);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {2, Arrays.stream("1 5 3 4 2".split(" ")).mapToInt(Integer::parseInt).toArray(), 3}
        };
    }
}