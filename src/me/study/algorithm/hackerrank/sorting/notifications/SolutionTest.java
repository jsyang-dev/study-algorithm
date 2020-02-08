package me.study.algorithm.hackerrank.sorting.notifications;

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
    public void test(int[] expenditure, int d, int answer) {
        int result = this.solution.solution(expenditure, d);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("2 3 4 2 3 6 8 4 5".split(" ")).mapToInt(Integer::parseInt).toArray(), 5, 2},
                new Object[] {Arrays.stream("1 2 3 4 4".split(" ")).mapToInt(Integer::parseInt).toArray(), 4, 0}
        };
    }
}