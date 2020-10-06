package me.study.algorithm.hackerrank.hashmaps.frequencyqueries;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(List<List<Integer>> queries, List<Integer> answer) {
        List<Integer> result = this.solution.solution(queries);

        assertEquals(answer.toString(), result.toString());
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 5)),
                        new ArrayList<>(Arrays.asList(1, 6)),
                        new ArrayList<>(Arrays.asList(3, 2)),
                        new ArrayList<>(Arrays.asList(1, 10)),
                        new ArrayList<>(Arrays.asList(1, 10)),
                        new ArrayList<>(Arrays.asList(1, 6)),
                        new ArrayList<>(Arrays.asList(2, 5)),
                        new ArrayList<>(Arrays.asList(3, 2))
                )),
                new ArrayList<>(Arrays.asList(0, 1))},
                new Object[] {new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList(3, 4)),
                        new ArrayList<>(Arrays.asList(2, 1003)),
                        new ArrayList<>(Arrays.asList(1, 16)),
                        new ArrayList<>(Arrays.asList(3, 1))
                )),
                        new ArrayList<>(Arrays.asList(0, 1))}
        };
    }
}