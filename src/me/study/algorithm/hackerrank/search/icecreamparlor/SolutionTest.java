package me.study.algorithm.hackerrank.search.icecreamparlor;

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
    public void test(int[] cost, int money, int[] answer) {
        int[] result = this.solution.solution(cost, money);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("1 4 5 3 2".split(" ")).mapToInt(Integer::parseInt).toArray(), 4, new int[] {1, 4}},
                new Object[] {Arrays.stream("2 2 4 3".split(" ")).mapToInt(Integer::parseInt).toArray(), 4, new int[] {1, 2}},
                new Object[] {Arrays.stream("7 2 5 4 11".split(" ")).mapToInt(Integer::parseInt).toArray(), 12, new int[] {1, 3}},
                new Object[] {Arrays.stream("4 3 2 5 7".split(" ")).mapToInt(Integer::parseInt).toArray(), 8, new int[] {2, 4}}
        };
    }
}