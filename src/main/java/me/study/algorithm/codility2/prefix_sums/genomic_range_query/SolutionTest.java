package me.study.algorithm.codility2.prefix_sums.genomic_range_query;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(String S, int[] P, int[] Q, int[] answer) {
        int[] result = this.solution.solution(S, P, Q);

        assertArrayEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{"CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[]{2, 4, 1}},
        };
    }
}
