package me.study.algorithm.codility2.stacks_and_queues.fish;

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
    public void test(int[] A, int[] B, int answer) {
        int result = this.solution.solution(A, B);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}, 2},
        };
    }
}
