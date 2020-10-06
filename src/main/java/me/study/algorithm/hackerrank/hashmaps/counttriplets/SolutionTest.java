package me.study.algorithm.hackerrank.hashmaps.counttriplets;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(List<Long> arr, long r, long answer) {
        long result = this.solution.solution(arr, r);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {Arrays.stream("1 2 2 4".split(" ")).map(Long::valueOf).collect(Collectors.toList()), 2L, 2L},
                new Object[] {Arrays.stream("1 3 9 9 27 81".split(" ")).map(Long::valueOf).collect(Collectors.toList()), 3L, 6L},
                new Object[] {Arrays.stream("1 5 5 25 125".split(" ")).map(Long::valueOf).collect(Collectors.toList()), 5L, 4L},
                new Object[] {Arrays.stream("1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1".split(" ")).map(Long::valueOf).collect(Collectors.toList()), 1L, 161700L},
                new Object[] {Collections.nCopies(100000, 0L), 1L, 166661666700000L}
        };
    }
}