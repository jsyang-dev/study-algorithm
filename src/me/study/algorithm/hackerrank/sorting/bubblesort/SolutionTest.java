package me.study.algorithm.hackerrank.sorting.bubblesort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int[] a) {
        this.solution.solution(a);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("1 2 3".split(" ")).mapToInt(Integer::parseInt).toArray()},
                new Object[] {Arrays.stream("3 2 1".split(" ")).mapToInt(Integer::parseInt).toArray()}
        };
    }
}