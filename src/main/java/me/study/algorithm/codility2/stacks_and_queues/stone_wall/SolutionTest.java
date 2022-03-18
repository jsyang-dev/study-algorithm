package me.study.algorithm.codility2.stacks_and_queues.stone_wall;

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
    public void test(int[] H, int answer) {
        int result = this.solution.solution(H);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}, 7},
        };
    }
}
