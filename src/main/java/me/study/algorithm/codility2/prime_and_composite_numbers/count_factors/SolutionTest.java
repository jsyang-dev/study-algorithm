package me.study.algorithm.codility2.prime_and_composite_numbers.count_factors;

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
    public void test(int N, int answer) {
        int result = this.solution.solution(N);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{24, 8},
        };
    }
}
